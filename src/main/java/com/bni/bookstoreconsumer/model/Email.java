package com.bni.bookstoreconsumer.model;

public class Email {
    private String emailTo;
    private String emailFrom;
    private String emailSubject;
    private String emailBody;

    public Email(String emailTo, String emailFrom, String emailSubject, String emailBody) {
        this.emailTo = emailTo;
        this.emailFrom = emailFrom;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }
}
