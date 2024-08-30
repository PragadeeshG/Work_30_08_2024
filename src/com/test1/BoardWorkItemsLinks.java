package com.test1;

public class BoardWorkItemsLinks {
	private String workItemNumber;
	private String developmentLinks;
	private String pullRequestLinks;
	private String relatedWorkLinks;
	private String scans;
	private String stateGraph;
	private String historyMap;
	private Integer incidentImpactCode;
	private String businessImpactDocLink;
	private String resolutionDetails;
	private String expectedBehaviour;

	public BoardWorkItemsLinks() {

	}

	public BoardWorkItemsLinks(String workItemNumber, String developmentLinks, String pullRequestLinks,
			String relatedWorkLinks, String scans, String stateGraph, String historyMap, Integer incidentImpactCode,
			String businessImpactDocLink, String resolutionDetails, String expectedBehaviour) {
		super();
		this.workItemNumber = workItemNumber;
		this.developmentLinks = developmentLinks;
		this.pullRequestLinks = pullRequestLinks;
		this.relatedWorkLinks = relatedWorkLinks;
		this.scans = scans;
		this.stateGraph = stateGraph;
		this.historyMap = historyMap;
		this.incidentImpactCode = incidentImpactCode;
		this.businessImpactDocLink = businessImpactDocLink;
		this.resolutionDetails = resolutionDetails;
		this.expectedBehaviour = expectedBehaviour;
	}

	public String getWorkItemNumber() {
		return workItemNumber;
	}

	public void setWorkItemNumber(String workItemNumber) {
		this.workItemNumber = workItemNumber;
	}

	public String getDevelopmentLinks() {
		return developmentLinks;
	}

	public void setDevelopmentLinks(String developmentLinks) {
		this.developmentLinks = developmentLinks;
	}

	public String getPullRequestLinks() {
		return pullRequestLinks;
	}

	public void setPullRequestLinks(String pullRequestLinks) {
		this.pullRequestLinks = pullRequestLinks;
	}

	public String getRelatedWorkLinks() {
		return relatedWorkLinks;
	}

	public void setRelatedWorkLinks(String relatedWorkLinks) {
		this.relatedWorkLinks = relatedWorkLinks;
	}

	public String getScans() {
		return scans;
	}

	public void setScans(String scans) {
		this.scans = scans;
	}

	public String getStateGraph() {
		return stateGraph;
	}

	public void setStateGraph(String stateGraph) {
		this.stateGraph = stateGraph;
	}

	public String getHistoryMap() {
		return historyMap;
	}

	public void setHistoryMap(String historyMap) {
		this.historyMap = historyMap;
	}

	public Integer getIncidentImpactCode() {
		return incidentImpactCode;
	}

	public void setIncidentImpactCode(Integer incidentImpactCode) {
		this.incidentImpactCode = incidentImpactCode;
	}

	public String getBusinessImpactDocLink() {
		return businessImpactDocLink;
	}

	public void setBusinessImpactDocLink(String businessImpactDocLink) {
		this.businessImpactDocLink = businessImpactDocLink;
	}

	public String getResolutionDetails() {
		return resolutionDetails;
	}

	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}

	public String getExpectedBehaviour() {
		return expectedBehaviour;
	}

	public void setExpectedBehaviour(String expectedBehaviour) {
		this.expectedBehaviour = expectedBehaviour;
	}

}
