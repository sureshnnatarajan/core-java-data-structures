package com.suresh.learnings.streams;

public class ReportCard {

	private String name;
	
	private String emailId;
	
	private Integer score;
	
	public ReportCard(String name, String emailId, Integer score) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ReportCard [name=" + name + ", emailId=" + emailId + ", score=" + score + "]";
	}
	
	
}
