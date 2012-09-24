package net.bioclipse.dbxp.business;
import java.util.Date;


public class IsatabS {
	private String studyIdentifier;
	private String studyTitle;
	private Date studySubmissionDate;
	private Date studyPublicReleaseDate;
	private String studyDescription;
	private String studyFileNames;
	private String studyDesignType;
	private String studyDesignTypeTermAccessionNumber;
	private String studyDesignTypeTermSourceREF;
	private String pubmedIdList;
	private String publicationDoiList;
	private String publicationAuthorList;
	private String publicationTitleList;
	private String publicationStatusList;
	private String publicationStatusTermAccessionNumberList;
	private String publicationStatusTermSourceRefList;
	private String studyFactorName;
	private String studyFactorType;
	private String studyFactorTypeTermAccesionNumberList;
	private String studyFactorTypeTermSourceREF;
	private String studyAssayMeasurementType;
	private String studyAssayMeasurementTypeTermAccessionNumber;
	private String studyAssayMeasurementTypeTermSourceREF;				
	private String studyAssayTechnologyType;				
	private String studyAssayTechnologyTypeTermAccessionNumber;
	private String studyAssayTechnologyTypeTermSourceREF;				
	private String studyAssayTechnologyPlatform;				
	private String studyAssayFileName;										
	private String studyProtocolName;
	private String studyProtocolType;
	private String studyProtocolTypeTermAccessionNumber;
	private String studyProtocolTypeTermSourceREF;
	private String studyProtocolDescription;
	private String studyProtocolURI;							
	private String studyProtocolVersion;							
	private String studyProtocolParametersName;
	private String studyProtocolParametersNameTermAccessionNumber;							
	private String studyProtocolParametersNameTermSourceREF;							
	private String studyProtocolComponentsName;							
	private String studyProtocolComponentsType;							
	private String studyProtocolComponentsTypeTermAccessionNumber;							
	private String studyProtocolComponentsTypeTermSourceREF;													
	private String studyPersonLastName;				
	private String studyPersonFirstName;				
	private String studyPersonMidInitials;				
	private String studyPersonEmail;							
	private String studyPersonPhone;							
	private String studyPersonFax;							
	private String studyPersonAddress;				
	private String studyPersonAffiliation;
	private String studyPersonRoles;			
	private String studyPersonRolesTermAccessionNumber;							
	private String studyPersonRolesTermSourceREF;
	
	public IsatabS(String studyIdentifier, String studyTitle, Date studySubmissionDate, Date studyPublicReleaseDate, String studyDescription,
			String studyFileNames, String studyDesignType, String studyDesignTypeTermAccessionNumber, String studyDesignTypeTermSourceREF, 
			String pubmedIdList, String publicationDoiList, String publicationAuthorList, String publicationTitleList, String publicationStatusList, 
			String publicationStatusTermAccessionNumberList, String publicationStatusTermSourceRefList, String studyFactorName, String studyFactorType, 
			String studyFactorTypeTermAccesionNumberList, String studyFactorTypeTermSourceREF, String studyAssayMeasurementType, String studyAssayMeasurementTypeTermAccessionNumber, String studyAssayMeasurementTypeTermSourceREF, 
			String studyAssayTechnologyType, String studyAssayTechnologyTypeTermAccessionNumber, String studyAssayTechnologyTypeTermSourceREF, String studyAssayTechnologyPlatform, 
			String studyAssayFileName, String studyProtocolName, String studyProtocolType, String studyProtocolTypeTermAccessionNumber, String studyProtocolTypeTermSourceREF, 
			String studyProtocolDescription, String studyProtocolURI, String studyProtocolVersion, String studyProtocolParametersName, String studyProtocolParametersNameTermAccessionNumber,
			String studyProtocolParametersNameTermSourceREF, String studyProtocolComponentsName, String studyProtocolComponentsType, String studyProtocolComponentsTypeTermAccessionNumber,
			String studyProtocolComponentsTypeTermSourceREF, String studyPersonLastName, String studyPersonFirstName, String studyPersonMidInitials,
			String studyPersonEmail, String studyPersonPhone, String studyPersonFax, String studyPersonAddress, String studyPersonAffiliation, String studyPersonRoles, String studyPersonRolesTermAccessionNumber,
			String studyPersonRolesTermSourceREF){
		
		this.studyIdentifier=studyIdentifier;
		this.studyTitle=studyTitle;
		this.studySubmissionDate=studySubmissionDate;
		this.studyPublicReleaseDate=studyPublicReleaseDate;
		this.studyDescription=studyDescription;
		this.studyFileNames=studyFileNames;
		this.studyDesignType=studyDesignType;
		this.studyDesignTypeTermAccessionNumber=studyDesignTypeTermAccessionNumber;
		this.studyDesignTypeTermSourceREF=studyDesignTypeTermSourceREF;
		this.pubmedIdList=pubmedIdList;
		this.publicationDoiList=publicationDoiList;
		this.publicationAuthorList=publicationAuthorList;
		this.publicationTitleList=publicationTitleList;
		this.publicationStatusList=publicationStatusList;
		this.publicationStatusTermAccessionNumberList=publicationStatusTermAccessionNumberList;
		this.publicationStatusTermSourceRefList=publicationStatusTermSourceRefList;
		this.studyFactorName=studyFactorName;
		this.studyFactorType=studyFactorType;
		this.studyFactorTypeTermAccesionNumberList=studyFactorTypeTermAccesionNumberList;
		this.studyFactorTypeTermSourceREF=studyFactorTypeTermSourceREF;
		this.studyAssayMeasurementType=studyAssayMeasurementType;
		this.studyAssayMeasurementTypeTermAccessionNumber=studyAssayMeasurementTypeTermAccessionNumber;
		this.studyAssayMeasurementTypeTermSourceREF=studyAssayMeasurementTypeTermSourceREF;				
		this.studyAssayTechnologyType=studyAssayTechnologyType;				
		this.studyAssayTechnologyTypeTermAccessionNumber=studyAssayTechnologyTypeTermAccessionNumber;
		this.studyAssayTechnologyTypeTermSourceREF=studyAssayTechnologyTypeTermSourceREF;				
		this.studyAssayTechnologyPlatform=studyAssayTechnologyPlatform;				
		this.studyAssayFileName=studyAssayFileName;										
		this.studyProtocolName=studyProtocolName;
		this.studyProtocolType=studyProtocolType;
		this.studyProtocolTypeTermAccessionNumber=studyProtocolTypeTermAccessionNumber;
		this.studyProtocolTypeTermSourceREF=studyProtocolTypeTermSourceREF;
		this.studyProtocolDescription=studyProtocolDescription;
		this.studyProtocolURI=studyProtocolURI;							
		this.studyProtocolVersion=studyProtocolVersion;							
		this.studyProtocolParametersName=studyProtocolParametersName;
		this.studyProtocolParametersNameTermAccessionNumber=studyProtocolParametersNameTermAccessionNumber;							
		this.studyProtocolParametersNameTermSourceREF=studyProtocolParametersNameTermSourceREF;							
		this.studyProtocolComponentsName=studyProtocolComponentsName;							
		this.studyProtocolComponentsType=studyProtocolComponentsType;							
		this.studyProtocolComponentsTypeTermAccessionNumber=studyProtocolComponentsTypeTermAccessionNumber;							
		this.studyProtocolComponentsTypeTermSourceREF=studyProtocolComponentsTypeTermSourceREF;													
		this.studyPersonLastName=studyPersonLastName;				
		this.studyPersonFirstName=studyPersonFirstName;				
		this.studyPersonMidInitials=studyPersonMidInitials;				
		this.studyPersonEmail=studyPersonEmail;							
		this.studyPersonPhone=studyPersonPhone;							
		this.studyPersonFax=studyPersonFax;							
		this.studyPersonAddress=studyPersonAddress;				
		this.studyPersonAffiliation=studyPersonAffiliation;
		this.studyPersonRoles=studyPersonRoles;			
		this.studyPersonRolesTermAccessionNumber=studyPersonRolesTermAccessionNumber;							
		this.studyPersonRolesTermSourceREF=studyPersonRolesTermSourceREF;
	}
	public void setstudyIdentifier(String value){ this.studyIdentifier =value;}
	public void setstudyTitle(String value){ this.studyTitle =value;}
	public void setstudySubmissionDate(Date value){ this.studySubmissionDate =value;}
	public void setstudyPublicReleaseDate(Date value){ this.studyPublicReleaseDate=value;}
	public void setstudyDescription(String value){ this.studyDescription=value;}
	public void setstudyFileNames(String value){ this.studyFileNames=value;}
	public void setstudyDesignType(String value){ this.studyDesignType=value;}
	public void setstudyDesignTypeTermAccessionNumber(String value){ this.studyDesignTypeTermAccessionNumber  =value;}
	public void setstudyDesignTypeTermSourceREF(String value){ this.studyDesignTypeTermSourceREF =value;}
	public void setpubmedIdList(String value){ this.pubmedIdList=value;}
	public void setpublicationDoiList(String value){ this.publicationDoiList=value;}
	public void setpublicationAuthorList(String value){ this.publicationAuthorList=value;}
	public void setpublicationTitleList(String value){ this.publicationTitleList=value;}
	public void setpublicationStatusList(String value){ this.publicationStatusList=value;}
	public void setpublicationStatusTermAccessionNumberList(String value){ this.publicationStatusTermAccessionNumberList=value;}
	public void setpublicationStatusTermSourceRefList(String value){ this.publicationStatusTermSourceRefList=value;}
	public void setstudyFactorName(String value){ this.studyFactorName=value;}
	public void setstudyFactorType(String value){ this.studyFactorType=value;}
	public void setstudyFactorTypeTermAccesionNumberList(String value){ this.studyFactorTypeTermAccesionNumberList=value;}
	public void setstudyFactorTypeTermSourceREF(String value){ this.studyFactorTypeTermSourceREF=value;}
	public void setstudyAssayMeasurementType(String value){ this.studyAssayMeasurementType=value;}
	public void setstudyAssayMeasurementTypeTermAccessionNumber(String value){ this.studyAssayMeasurementTypeTermAccessionNumber=value;}
	public void setstudyAssayMeasurementTypeTermSourceREF(String value){ this.studyAssayMeasurementTypeTermSourceREF=value;}				
	public void setstudyAssayTechnologyType(String value){ this.studyAssayTechnologyType=value;}				
	public void setstudyAssayTechnologyTypeTermAccessionNumber(String value){ this.studyAssayTechnologyTypeTermAccessionNumber   =value;}
	public void setstudyAssayTechnologyTypeTermSourceREF(String value){ this.studyAssayTechnologyTypeTermSourceREF=value;}				
	public void setstudyAssayTechnologyPlatform(String value){ this.studyAssayTechnologyPlatform=value;}				
	public void setstudyAssayFileName(String value){ this.studyAssayFileName=value;}										
	public void setstudyProtocolName(String value){ this.studyProtocolName=value;}
	public void setstudyProtocolType(String value){ this.studyProtocolType=value;}
	public void setstudyProtocolTypeTermAccessionNumber(String value){ this.studyProtocolTypeTermAccessionNumber=value;}
	public void setstudyProtocolTypeTermSourceREF(String value){ this.studyProtocolTypeTermSourceREF=value;}
	public void setstudyProtocolDescription(String value){ this.studyProtocolDescription=value;}
	public void setstudyProtocolURI(String value){ this.studyProtocolURI=value;}							
	public void setstudyProtocolVersion(String value){ this.studyProtocolVersion=value;}							
	public void setstudyProtocolParametersName(String value){ this.studyProtocolParametersName=value;}
	public void setstudyProtocolParametersNameTermAccessionNumber(String value){ this.studyProtocolParametersNameTermAccessionNumber=value;}							
	public void setstudyProtocolParametersNameTermSourceREF(String value){ this.studyProtocolParametersNameTermSourceREF=value;}							
	public void setstudyProtocolComponentsName(String value){ this.studyProtocolComponentsName=value;}							
	public void setstudyProtocolComponentsType(String value){ this.studyProtocolComponentsType=value;}							
	public void setstudyProtocolComponentsTypeTermAccessionNumber(String value){ this.studyProtocolComponentsTypeTermAccessionNumber=value;}							
	public void setstudyProtocolComponentsTypeTermSourceREF(String value){ this.studyProtocolComponentsTypeTermSourceREF=value;}													
	public void setstudyPersonLastName(String value){ this.studyPersonLastName=value;}				
	public void setstudyPersonFirstName(String value){ this.studyPersonFirstName=value;}				
	public void setstudyPersonMidInitials(String value){ this.studyPersonMidInitials=value;}				
	public void setstudyPersonEmail(String value){ this.studyPersonEmail=value;}							
	public void setstudyPersonPhone(String value){ this.studyPersonPhone=value;}							
	public void setstudyPersonFax(String value){ this.studyPersonFax=value;}							
	public void setstudyPersonAddress(String value){ this.studyPersonAddress=value;}				
	public void setstudyPersonAffiliation(String value){ this.studyPersonAffiliation=value;}
	public void setstudyPersonRoles(String value){ this.studyPersonRoles=value;}			
	public void setstudyPersonRolesTermAccessionNumber(String value){ this.studyPersonRolesTermAccessionNumber=value;}							
	public void setstudyPersonRolesTermSourceREF(String value){ this.studyPersonRolesTermSourceREF=value;}
}
