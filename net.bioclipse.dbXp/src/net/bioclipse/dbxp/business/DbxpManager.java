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

import net.bioclipse.managers.business.IBioclipseManager;

import org.apache.log4j.Logger;

public class DbxpManager implements IBioclipseManager {

    private static final Logger logger = Logger.getLogger(DbxpManager.class);

    /**
     * Gives a short one word name of the manager used as variable name when
     * scripting.
     */
    
    
    public String getManagerName() {
        return "dbxp";
    }
    
    public String authenticate(String deviceID){
    	return "stub";
    }
    
    public String getStudies(String deviceID, String validation){
    	return "stub";
    }

    public String getSubjectsForStudy(String deviceID, String validation, String studyToken){
    	return "stub";
    }
    public String getAssaysForStudy(String deviceID, String validation, String studyToken){
    	return "stub";
    }
    public String getSamplesForAssay(String deviceID, String validation, String assayToken){
    	// fetch all samples in a given assay
    	return "stub";
    }
    public String getMeasurementDataForAssay(String deviceID, String validation, String assayToken) {
    	//- fetch all measurement data for a given assay
    	return "stub ";
    }
    
    
    
}
