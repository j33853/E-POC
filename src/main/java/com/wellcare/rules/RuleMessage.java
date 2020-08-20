
package com.wellcare.rules;

import java.io.Serializable;

public class RuleMessage implements Serializable
{

    private String messageCode;
    private String messageText;
    private final static long serialVersionUID = -3762762361404975175L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RuleMessage() {
    }

    /**
     * 
     * @param messageCode
     * @param messageText
     */
    public RuleMessage(String messageCode, String messageText) {
        super();
        this.messageCode = messageCode;
        this.messageText = messageText;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

}
