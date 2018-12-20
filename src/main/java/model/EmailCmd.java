package model;

import mail.Email;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmailCmd implements Email, Serializable {
    private String recipient;
    private String subject;
    private String htmlBody;
    private String textBody;
    private String replyTo;
    private String source = "sonumiet068@gmail.com";

    public EmailCmd() {

    }


    public EmailCmd(String recipient, String subject, String htmlBody, String textBody, String replyTo, String source) {
        this.recipient = recipient;
        this.subject = subject;
        this.htmlBody = htmlBody;
        this.textBody = textBody;
        this.replyTo = replyTo;
        this.source = source;
    }


    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getTextBody() {
        return textBody;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

}
