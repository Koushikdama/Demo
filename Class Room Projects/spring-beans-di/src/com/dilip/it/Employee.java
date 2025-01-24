package com.dilip.it;

public class Employee {

	// Variables/fields/properties
	public String companyName ;
	public String InfoemaiId;
	public int empId;
	public String empName;

	public Employee() {
		System.out.println("Employee Object Is created...");
	}

	public void printEmpInforamtion() {
		System.out.println(companyName);
		System.out.println(InfoemaiId);
		System.out.println(empId);
		System.out.println(empName);
	}

	// Can i achieve setter Injection or not?

	public void setEmpId(int empId) {
		System.out.println("setter of eid is called");
		this.empId = empId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		System.out.println("setter of companyName is called");
		this.companyName = companyName;
	}

	public String getInfoemaiId() {
		return InfoemaiId;
	}

	public void setInfoemaiId(String infoemaiId) {
		System.out.println("setter of infoemaiId is called");
		InfoemaiId = infoemaiId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("setter of empName is called");
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

}
