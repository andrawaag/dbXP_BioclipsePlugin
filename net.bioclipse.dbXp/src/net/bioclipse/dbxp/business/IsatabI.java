package net.bioclipse.dbxp.business;

import java.util.Date;

public class IsatabI {
	private String investigationIdentifier;
	private String investigationTitle;
	private String investigationDescription;
	private Date investigationSubmissionDate;
	private Date investigationPublicReleaseDate;
	private String pubmedIdList;
	private String publicationDoiList;
	private String publicationAuthorList;
	private String publicationTitleList;
	private String publicationStatusList;
	private String publicationStatusTermAccessionNumberList;
	private String publicationStatusTermSourceRefList;
	private String publicationPersonLastNameList;
	private String publicationPersonFirstNameList;
	private String publicationPersonMidInitialsList;
	private String publicationPersonEmailList;
	private String publicationPersonPhoneList;
	private String publicationPersonFaxList;
	private String publicationPersonAddressList;
	private String publicationPersonAffiliationList;
	private String publicationPersonRolesList;
	private String publicationPersonRolesTermAccessionNumberList;
	private String publicationPersonRolesTermSourceREF;
	
	public IsatabI(String investigationIdentifier, String investigationTitle, String investigationDescription, 
			Date investigationSubmissionDate, Date investigationPublicReleaseDate,String[] pubmedIdList, String[] publicationDoiList,
			String[] publicationAuthorList, String[] publicationTitleList, String[] publicationStatusList, String[] publicationStatusTermAccessionNumberList,
			String[] publicationStatusTermSourceRefList, String[] publicationPersonLastNameList, String[] publicationPersonFirstNameList, String[] publicationPersonMidInitialsList,
			String[] publicationPersonEmailList, String[] publicationPersonPhoneList, String[] publicationPersonFaxList, String[] publicationPersonAddressList, 
			String[] publicationPersonAffiliationList, String[] publicationPersonRolesList, String[] publicationPersonRolesTermAccessionNumberList, 
			String[] publicationPersonRolesTermSourceREF
			) {
		this.investigationIdentifier = investigationIdentifier;
		this.investigationTitle = investigationTitle;
		this.investigationDescription = investigationDescription;
		this.investigationSubmissionDate = investigationSubmissionDate;
		this.investigationPublicReleaseDate = investigationPublicReleaseDate;		
		this.pubmedIdList = pubmedIdList.toString();
		this.publicationDoiList = publicationDoiList.toString();
		this.publicationAuthorList = publicationAuthorList.toString();
		this.publicationTitleList = publicationTitleList.toString();
		this.publicationStatusList = publicationStatusList.toString();
		this.publicationStatusTermAccessionNumberList = publicationStatusTermAccessionNumberList.toString();
		this.publicationStatusTermSourceRefList = publicationStatusTermSourceRefList.toString();
		this.publicationPersonLastNameList = publicationPersonLastNameList.toString();
		this.publicationPersonFirstNameList = publicationPersonFirstNameList.toString();
		this.publicationPersonMidInitialsList = publicationPersonMidInitialsList.toString();
		this.publicationPersonEmailList = publicationPersonEmailList.toString();
		this.publicationPersonPhoneList = publicationPersonPhoneList.toString();
		this.publicationPersonFaxList = publicationPersonFaxList.toString();
		this.publicationPersonAddressList = publicationPersonAddressList.toString();
		this.publicationPersonAffiliationList = publicationPersonAffiliationList.toString();
		this.publicationPersonRolesList = publicationPersonRolesList.toString();
		this.publicationPersonRolesTermAccessionNumberList = publicationPersonRolesTermAccessionNumberList.toString();
		this.publicationPersonRolesTermSourceREF = publicationPersonRolesTermSourceREF.toString();	
	}
		
	public void setInvestigationIdentifier(String value){ this.investigationIdentifier=value;}
	public void setInvestigationDescription(String value) {this.investigationDescription=value;}
	public void setInvestigationTitle(String value) {this.investigationTitle = value;}
	public void setInvestigationSubmissionDate(Date value) {this.investigationSubmissionDate = value;}
	public void setInvestigationPublicReleaseDate(Date value) {this.investigationPublicReleaseDate = value;}
	public void setPubmedIdList(String value) { this.pubmedIdList = value;};
	public void setPublicationDoiList(String value) {this.publicationDoiList = value;}
	public void setPublicationAuthorList(String value) { this.publicationAuthorList=value;};
	public void setPublicationTitleList(String value) {this.publicationTitleList=value;};
	public void setPublicationStatusList(String value) {this.publicationStatusList=value;};
	public void setPublicationStatusTermAccessionNumber(String value) {this.publicationStatusTermAccessionNumberList = value;};
	public void setPublicationStatusTermSourceRefList(String value) {this.publicationStatusTermSourceRefList = value;};
	public void setPublicationPersonLastNameList(String value) {this.publicationPersonLastNameList = value;};
	public void setPublicationPersonFirstNameList(String value) {this.publicationPersonFirstNameList = value;};
	public void setPublicationPersonMidInitialsList(String value) {this.publicationPersonMidInitialsList = value;};
	public void setPublicationPersonEmailList(String value) {this.publicationPersonEmailList = value;};
	public void setPublicationPersonPhoneList(String value) {this.publicationPersonPhoneList = value;};
	public void setPublicationPersonFaxList(String value) {this.publicationPersonFaxList = value;};
	public void setPublicationPersonAddressList(String value) {this.publicationPersonAddressList = value;};
	public void setPublicationPersonAffiliationList(String value) {this.publicationPersonAffiliationList = value;};
	public void setPublicationPersonRolesList(String value) {this.publicationPersonRolesList = value;};
	public void setPublicationPersonRolesTermAccessionNumberList(String value) {this.publicationPersonRolesTermAccessionNumberList = value;};
	public void setPublicationPersonRolesTermSourceRef(String value) {this.publicationPersonRolesTermSourceREF = value;};
}
