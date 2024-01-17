package com.ibm.example.model;

public enum GuiterType {
	AQUASTIC("Guiter Type Is: AQUASTIC"),
	ELECTRIC("Guiter Type Is: ELECTRIC"),
	JAAZ("Guiter Type Is: JAAZ"),
	BASS("Guiter Type Is: BASS");
	
	private String type;

	private GuiterType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
