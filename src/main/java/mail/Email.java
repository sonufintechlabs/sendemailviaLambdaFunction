package mail;

import java.util.List;

public interface Email {
    String getRecipient();
    String getSubject();
    String getHtmlBody();
    String getTextBody();
    String getReplyTo();
    String getSource();

}