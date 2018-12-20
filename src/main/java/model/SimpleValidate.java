package model;

public class SimpleValidate {
    String recipient;
    String subject;
    String htmlBody;
    String textBody;

    public SimpleValidate() {
    }

    public SimpleValidate(String recipient, String subject, String htmlBody, String textBody) {
        this.recipient = recipient;
        this.subject = subject;
        this.htmlBody = htmlBody;
        this.textBody = textBody;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }
}
