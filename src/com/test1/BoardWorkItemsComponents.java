package com.test1;

public class BoardWorkItemsComponents {
	private String workItemNumber;
	private String systemInfo;
	private boolean planning;
	private Integer impact;
	private String applicationId;
	private String affectVersion;
	private Integer impactedEnvironment;
	private Integer testPhase;
	private String testActivity;
	private Integer issueDescription;
	private String plannedStartDate;
	private String plannedEndDate;
	private String dueDate;

	public BoardWorkItemsComponents() {

	}

	public BoardWorkItemsComponents(String workItemNumber, String systemInfo, boolean planning, Integer impact,
			String applicationId, String affectVersion, Integer impactedEnvironment, Integer testPhase,
			String testActivity, Integer issueDescription, String plannedStartDate, String plannedEndDate,
			String dueDate) {
		super();
		this.workItemNumber = workItemNumber;
		this.systemInfo = systemInfo;
		this.planning = planning;
		this.impact = impact;
		this.applicationId = applicationId;
		this.affectVersion = affectVersion;
		this.impactedEnvironment = impactedEnvironment;
		this.testPhase = testPhase;
		this.testActivity = testActivity;
		this.issueDescription = issueDescription;
		this.plannedStartDate = plannedStartDate;
		this.plannedEndDate = plannedEndDate;
		this.dueDate = dueDate;
	}

	public String getWorkItemNumber() {
		return workItemNumber;
	}

	public void setWorkItemNumber(String workItemNumber) {
		this.workItemNumber = workItemNumber;
	}

	public String getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(String systemInfo) {
		this.systemInfo = systemInfo;
	}

	public boolean isPlanning() {
		return planning;
	}

	public void setPlanning(boolean planning) {
		this.planning = planning;
	}

	public Integer getImpact() {
		return impact;
	}

	public void setImpact(Integer impact) {
		this.impact = impact;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getAffectVersion() {
		return affectVersion;
	}

	public void setAffectVersion(String affectVersion) {
		this.affectVersion = affectVersion;
	}

	public Integer getImpactedEnvironment() {
		return impactedEnvironment;
	}

	public void setImpactedEnvironment(Integer impactedEnvironment) {
		this.impactedEnvironment = impactedEnvironment;
	}

	public Integer getTestPhase() {
		return testPhase;
	}

	public void setTestPhase(Integer testPhase) {
		this.testPhase = testPhase;
	}

	public String getTestActivity() {
		return testActivity;
	}

	public void setTestActivity(String testActivity) {
		this.testActivity = testActivity;
	}

	public Integer getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(Integer issueDescription) {
		this.issueDescription = issueDescription;
	}

	public String getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(String plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public String getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(String plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}
