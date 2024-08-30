package com.test1;

public class BoardWorkItems {
	private String workItemNumber;
	private String url;
	private String workItemType;
	private String state;
	private String reason;
	private String area;
	private String iteration;
	private Integer tags;
	private String labels;
	private String assignedTo;
	private String createdBy;

	public BoardWorkItems() {

	}

	public BoardWorkItems(String workItemNumber, String url, String workItemType, String state, String reason,
			String area, String iteration, Integer tags, String labels, String assignedTo, String createdBy) {
		super();
		this.workItemNumber = workItemNumber;
		this.url = url;
		this.workItemType = workItemType;
		this.state = state;
		this.reason = reason;
		this.area = area;
		this.iteration = iteration;
		this.tags = tags;
		this.labels = labels;
		this.assignedTo = assignedTo;
		this.createdBy = createdBy;
	}

	public String getWorkItemNumber() {
		return workItemNumber;
	}

	public void setWorkItemNumber(String workItemNumber) {
		this.workItemNumber = workItemNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWorkItemType() {
		return workItemType;
	}

	public void setWorkItemType(String workItemType) {
		this.workItemType = workItemType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public Integer getTags() {
		return tags;
	}

	public void setTags(Integer tags) {
		this.tags = tags;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
