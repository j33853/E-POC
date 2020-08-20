
package com.wellcare.emerald.rules;

import java.io.Serializable;

public class ApplicantIdentifier implements Serializable
{

    private String identifierTypeCode;
    private String identifierValue;
    private final static long serialVersionUID = -2348000034599916946L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApplicantIdentifier() {
    }

    /**
     * 
     * @param identifierValue
     * @param identifierTypeCode
     */
    public ApplicantIdentifier(String identifierTypeCode, String identifierValue) {
        super();
        this.identifierTypeCode = identifierTypeCode;
        this.identifierValue = identifierValue;
    }

    public String getIdentifierTypeCode() {
        return identifierTypeCode;
    }

    public void setIdentifierTypeCode(String identifierTypeCode) {
        this.identifierTypeCode = identifierTypeCode;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

}
