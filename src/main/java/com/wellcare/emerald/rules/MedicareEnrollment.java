package com.wellcare.emerald.rules;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class MedicareEnrollment implements Serializable {

    private final static long serialVersionUID = 4801193572911484939L;
    private LocalDate applicantDOB;
    private List<ApplicantIdentifier> applicantIdentifiers = null;
    private String genderTypeCode;

    /**
     *
     * @param applicantDOB
     * @param applicantIdentifiers
     * @param genderTypeCode
     */
    public MedicareEnrollment(LocalDate applicantDOB, List<ApplicantIdentifier> applicantIdentifiers, String genderTypeCode) {
        this.applicantDOB = applicantDOB;
        this.applicantIdentifiers = applicantIdentifiers;
        this.genderTypeCode = genderTypeCode;
    }

    public MedicareEnrollment() {
    }

    public LocalDate getApplicantDOB() {
        return applicantDOB;
    }

    public void setApplicantDOB(LocalDate applicantDOB) {
        this.applicantDOB = applicantDOB;
    }

    public List<ApplicantIdentifier> getApplicantIdentifiers() {
        return applicantIdentifiers;
    }

    public void setApplicantIdentifiers(List<ApplicantIdentifier> applicantIdentifiers) {
        this.applicantIdentifiers = applicantIdentifiers;
    }

    public String getGenderTypeCode() {
        return genderTypeCode;
    }

    public void setGenderTypeCode(String genderTypeCode) {
        this.genderTypeCode = genderTypeCode;
    }
}
