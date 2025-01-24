package com.dilip.it.constructor.injection;

public class Patient {

	private int patientId;
	private String patientName;
	private long mobile;

	public Patient() {
		System.out.println("This is default constructor, patient created");
	}

	public Patient(int patientId, String patientName, long mobile) {
		System.out.println("This is Patient with 3 params, patient created ");
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobile = mobile;
	}

	public Patient(int patientId, String patientName) {
		System.out.println("This is Patient with 2 params, patient created ");
		this.patientId = patientId;
		this.patientName = patientName;
	}



	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		System.out.println("calling setPatientId with value "+patientId);
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
