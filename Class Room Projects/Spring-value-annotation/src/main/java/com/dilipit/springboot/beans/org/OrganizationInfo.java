package com.dilipit.springboot.beans.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrganizationInfo {

	// Not configured in properties file
	@Value("${org.emp.count:55}")
	private int orgEmpCount;

	
	// TODO : can we define default values for LIst type also Yes, No?
	@Value("${org.dept.names}")
	private List<String> deptNames;

	public List<String> getDeptNames() {
		return deptNames;
	}

	public void setDeptNames(List<String> deptNames) {
		this.deptNames = deptNames;
	}

	public int getOrgEmpCount() {
		return orgEmpCount;
	}

	public void setOrgEmpCount(int orgEmpCount) {
		this.orgEmpCount = orgEmpCount;
	}

}
