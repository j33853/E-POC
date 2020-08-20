package com.wellcare.emerald.rules;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class HixEnrollment implements Serializable {

	private final static long serialVersionUID = 4801193572911484939L;
	private LocalDate applicantDOB;
	private String genderTypeCode;

	public HixEnrollment() {
	}

	public LocalDate getApplicantDOB() {
		return applicantDOB;
	}

	public void setApplicantDOB(LocalDate applicantDOB) {
		this.applicantDOB = applicantDOB;
	}

	public String getGenderTypeCode() {
		return genderTypeCode;
	}

	public void setGenderTypeCode(String genderTypeCode) {
		this.genderTypeCode = genderTypeCode;
	}

	public HixEnrollment(java.time.LocalDate applicantDOB,
			java.lang.String genderTypeCode) {
		this.applicantDOB = applicantDOB;
		this.genderTypeCode = genderTypeCode;
	}
}
