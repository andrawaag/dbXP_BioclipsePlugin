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

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;

import net.bioclipse.core.PublishedClass;
import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.core.business.BioclipseException;
import net.bioclipse.managers.business.IBioclipseManager;

@PublishedClass(
    value="Manager for dbXp"
)
public interface IDbxpManager extends IBioclipseManager {

	@Recorded
	@PublishedMethod(
			params = "", 
			methodSummary = "Authenticate a client using HTTP BASIC authentication. This API call is used to:\n" + 
					"\n" + 
					"initially set up a client/server session\n" + 
					"re-synchronise client/server sessions that become out of sync (e.g. sequence differences)\n" + 
					"After successful authentication, a session token is returned which should the client should store locally. This session token should be used in all subsequent calls to calculate the validation md5 hash.\n" + 
					"\n" + 
					"This call should also be performed whenever a client/server sessions becomes out of sync (e.g. the client's sequence count differs from the server's sequence count) as the server's sequence count will be returned after successfully authenticating. For security reasons this api method is designed to be called only once (or when sessions are out of sync) as HTTP BASIC authentication is not really secure (if someone is able to sniff your traffic, the authentication md5 hash is easily stolen). API calls are validated using the calculated md5 hash.\n" + 
					"\n" + 
					"Every subsequent request the client does, needs to contain the validation MD5 hash, which is a MD5 sum of the concatenation of the device token, the request sequence and the api key (e.g. md5sum( token + sequence + api key ) ).\n" + 
					"Note that in order to be able to successfully authenticate or use the API in general, the user should have the ROLE_CLIENT assigned!"

	)
	public Map<String, String> authenticate()
	throws IOException, BioclipseException, CoreException;
	
	@Recorded
	@PublishedMethod(
			params = "", 
			methodSummary = "Returns the studies which are readable and/or writable for the client. If the client should get access to a particular study, the client's username (used to authenticate) should be added as a reader to the study."

	)
	public  Map<String, Object> getStudies()
	throws IOException, BioclipseException, CoreException;
	
	@Recorded
	@PublishedMethod(
			params = "", 
			methodSummary = "Returns the subjects for a particular study"

	)
    public  Map<String, Object> getSubjectsForStudy(String studyToken)
	throws IOException, BioclipseException, CoreException;
	
	@Recorded
	@PublishedMethod(
			params = "String studyToken", 
			methodSummary = "Returns the assays for a particular study"

	)
	public Map<String, Object> getAssaysForStudy(String studyToken) throws IOException, BioclipseException, CoreException;
	
	
	@Recorded
	@PublishedMethod(
			params = "String assayToken", 
			methodSummary = "Returns the assays for a particular study"

	)
    public Map<String, Object> getSamplesForAssay(String assayToken) throws IOException, BioclipseException, CoreException;
	
	@Recorded
	@PublishedMethod(
			params = "String assayToken", 
			methodSummary = "Returns the measurement data for a particular assay"

	)
    public Map<String, Object> getMeasurementDataForAssay(String assayToken) throws IOException, BioclipseException, CoreException;

}
