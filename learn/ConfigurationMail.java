package learn;

public enum ConfigurationMail {
	
	SOAASSIGNMENTMANDATEPDFFILEJOB("CL016_SoaAssignmentMandatePdfFileJobSubject", "CL017_SoaAssignmentMandatePdfFileJobTo", "CL018_SoaAssignmentMandatePdfFileJobCC", "CL019_SoaAssignmentMandatePdfFileJobBCC", "CL020_SoaAssignmentMandatePdfFileJobReplyTo", "CL021_SoaAssignmentMandatePdfFileJobTemplate", null, "CL029_MailFrom"),
	
	PDFFILEJOB("CL022_PdfFileJobSubject", "CL023_PdfFileJobTo", "CL024_PdfFileJobCC", "CL025_PdfFileJobBCC", "CL026_PdfFileJobReplyTo", "CL027_PdfFileJobTemplate", null, "CL029_MailFrom"),
	
	WORKLISTNOTIFICATIONJOB("CL059_WorklistNotificationSubject", null, "CL060_WorklistNotificationCC", "CL061_WorklistNotificationBcc", "CL062_WorklistNotificationReplyTo", "CL063_WorklistNotificationTemplate", "CL120_WorklistNotificationForceTo", "CL125_CollectionMailFrom"),

	WORKLISTNOTIFICATIONJOBERROR("CL065_WorklistNotificationErrorSubject", "CL070_WorklistNotificationErrorTo", "CL066_WorklistNotificationErrorCC", "CL067_WorklistNotificationErrorBcc", "CL068_WorklistNotificationErrorReplyTo", "CL069_WorklistNotificationErrorTemplate", null, "CL029_MailFrom");

	private String subjectConfigurationName;
	
	private String toConfigurationName;
	
	private String CCConfigurationName;
	
	private String BCCConfigurationName;
	
	private String replyToConfigurationName;
	
	private String templateConfigurationName;
	
	private String forceToConfigurationName;
	
	private String collectionMailFrom;
	
	private ConfigurationMail(String subjectConfigurationName, String toConfigurationName, String CCConfigurationName, String BCCConfigurationName, String replyToConfigurationName, String templateConfigurationName, String forceToConfigurationName, String collectionMailFrom) {
		this.subjectConfigurationName = subjectConfigurationName;
		this.toConfigurationName = toConfigurationName;
		this.CCConfigurationName = CCConfigurationName;
		this.BCCConfigurationName = BCCConfigurationName;
		this.replyToConfigurationName = replyToConfigurationName;
		this.templateConfigurationName = templateConfigurationName;
		this.forceToConfigurationName = forceToConfigurationName;
		this.collectionMailFrom = collectionMailFrom;
	}

	public String getSubjectConfigurationName() {
		return subjectConfigurationName;
	}

	public String getToConfigurationName() {
		return toConfigurationName;
	}

	public String getCCConfigurationName() {
		return CCConfigurationName;
	}

	public String getBCCConfigurationName() {
		return BCCConfigurationName;
	}

	public String getTemplateConfigurationName() {
		return templateConfigurationName;
	}

	public String getReplyToConfigurationName() {
		return replyToConfigurationName;
	}

	public String getForceToConfigurationName() {
		return forceToConfigurationName;
	}

	public String getCollectionMailFrom() {
		return collectionMailFrom;
	}
	
	
}
