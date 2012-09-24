/*******************************************************************************
 * Copyright (c) 2012  Andra Waagmeester <andra.waagmeester@maastrichtuniversity.nl>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 ******************************************************************************/
package net.bioclipse.dbxp.business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.bioclipse.managers.business.IBioclipseManager;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.log4j.Logger;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class DbxpManager implements IBioclipseManager {


	private static final Logger logger = Logger.getLogger(DbxpManager.class);

	private static String userName = "andrawaag";
	private static String password = "welkom";
	private static String baseApiUrl = "http://old.studies.dbnp.org/api/";
	private static String apiKey = "74b73415-2973-4fb0-8494-4458043be0fe";


	/*//User specific credentials  studies 
	private static String userName = "andrawaag";
	private static String password = "3kkdzoe#";
	private static String baseApiUrl = "http://studies.dbnp.org/api/";
    private static String apiKey = "e5484d2d-6446-4b5e-abf2-f8748b1c5ff1";
	 */
	//Local variables
	private static String authenticate=null;
	private static String token="";
	private static int sequence=0;
	/**
	 * Gives a short one word name of the manager used as variable name when
	 * scripting.
	 */

	public String getManagerName() {
		return "dbxp";
	}

	public static void login(){
		System.out.println("To which server would you like to connect:");
		System.out.println("1. studies.dbnp.org");
		System.out.println("2. old.studies.dbnp.org");

	}

	public static String getMacAddress() throws SocketException, UnknownHostException{ 
		InetAddress ip = InetAddress.getLocalHost();
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
		byte[] mac = network.getHardwareAddress();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "" : ""));		
		}
		//System.out.println(sb.toString());
		return sb.toString();
	}

	public static String getDeviceId() throws NoSuchAlgorithmException, SocketException, UnknownHostException {
		String deviceId = getMacAddress()+userName;
		//System.out.println(deviceId);
		return getMD5Sum(deviceId);
	}

	/* getMD5Sum returns the MD5 sum of the variable parameteren */

	public static String getMD5Sum(String variable) throws NoSuchAlgorithmException{	
		MessageDigest md=MessageDigest.getInstance("MD5");
		md.update(variable.getBytes());
		return new BigInteger(1,md.digest()).toString(16);
	}

	public static HttpResponse postValues(HashMap<String, String> postvars, String url) throws NoSuchAlgorithmException, ClientProtocolException, IOException{
		DefaultHttpClient httpclient = new DefaultHttpClient();
		httpclient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
				new UsernamePasswordCredentials(userName, password));

		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, String>> it = postvars.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> next = (Map.Entry<String, String>)it.next();
			Map.Entry<String, String> pairs = next;
			formparams.add(new BasicNameValuePair(pairs.getKey(), pairs.getValue()));
		}
		UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");	
		HttpPost httppost = new HttpPost(url);
		httppost.setEntity(entity);
		HttpContext localContext = new BasicHttpContext();
		return httpclient.execute(httppost, localContext);
	}

	public static Map<String, String> authenticate() throws IOException, NoSuchAlgorithmException{
		DefaultHttpClient httpclient = new DefaultHttpClient();
		httpclient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
				new UsernamePasswordCredentials(userName, password));

		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		HashMap<String, String> formvars = new HashMap<String, String>();
		formvars.put("deviceID", getDeviceId());
		HttpResponse response = postValues(formvars, baseApiUrl+"authenticate");	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String json = "";
		String s = "";
		while ((s = stdInput.readLine()) != null) {
			json += s;
		}

		Gson gson = new Gson();
		Map<String, String> loginData = gson.fromJson(json, new TypeToken<Map<String, String>>(){}.getType());

		token = loginData.get("token");
		sequence = Integer.valueOf(loginData.get("sequence"));	

		return loginData;
	}

	public static String getValidation() throws IOException, NoSuchAlgorithmException {
		sequence++;
		String validation = token+sequence+apiKey;    
		String md5 =  getMD5Sum(validation);
		return md5;
	}


	public static Map<String, Object> getStudies() throws IOException, NoSuchAlgorithmException{
		HashMap<String, String> formvars = new HashMap<String, String>();
		formvars.put("deviceID", getDeviceId());
		formvars.put("validation", getValidation());
		HttpResponse response = postValues(formvars, baseApiUrl+"getStudies");	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String json = "";
		String s = "";
		while ((s = stdInput.readLine()) != null) {
			json += s;
		} 

		Gson gson = new Gson();
		Map<String, Object> subjectsData = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return subjectsData;
	}

	public static Map<String, Object> getSubjectsForStudy(String studyToken) throws NoSuchAlgorithmException, IOException{
		HashMap<String, String> formvars = new HashMap<String, String>();
		formvars.put("deviceID", getDeviceId());
		formvars.put("validation", getValidation());
		formvars.put("studyToken", studyToken);
		HttpResponse response = postValues(formvars, baseApiUrl+"getSubjectsForStudy");	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String json = "";
		String s = "";
		while ((s = stdInput.readLine()) != null) {
			json += s;
		} 
		Gson gson = new Gson();
		Map<String, Object> subjectsData = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return subjectsData;
	}

	public static Map<String, Object> getAssaysForStudy(String studyToken) throws NoSuchAlgorithmException, IOException{
		HashMap<String, String> formvars = new HashMap<String, String>();
		formvars.put("deviceID", getDeviceId());
		formvars.put("validation", getValidation());
		formvars.put("studyToken", studyToken);
		HttpResponse response = postValues(formvars, baseApiUrl+"getAssaysForStudy");	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String json = "";
		String s = "";
		while ((s = stdInput.readLine()) != null) {
			json += s;
		} 
		System.out.println(json);
		Gson gson = new Gson();
		Map<String, Object> subjectsData = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return subjectsData;
	}

	public static Map<String, Object> getSamplesForAssay(String assayToken) throws NoSuchAlgorithmException, IOException{
		HashMap<String, String> formvars = new HashMap<String, String>();
		formvars.put("deviceID", getDeviceId());
		formvars.put("validation", getValidation());
		formvars.put("assayToken", assayToken);
		HttpResponse response = postValues(formvars, baseApiUrl+"getAssaysForStudy");	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String json = "";
		String s = "";
		while ((s = stdInput.readLine()) != null) {
			json += s;
		} 
		Gson gson = new Gson();
		Map<String, Object> subjectsData = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return subjectsData;
	}


	public static Map<String, Object> getMeasurementDataForAssay(String assayToken) throws NoSuchAlgorithmException, IOException{
		HashMap<String, String> formvars = new HashMap<String, String>();
		formvars.put("deviceID", getDeviceId());
		formvars.put("validation", getValidation());
		formvars.put("assayToken", assayToken);
		HttpResponse response = postValues(formvars, baseApiUrl+"getMeasurementDataForAssay");	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String json = "";
		String s = "";
		while ((s = stdInput.readLine()) != null) {
			json += s;
		} 
		Gson gson = new Gson();
		Map<String, Object> subjectsData = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		return subjectsData;
	}





}
