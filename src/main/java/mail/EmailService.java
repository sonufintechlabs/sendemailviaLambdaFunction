package mail;


import com.amazonaws.http.HttpResponse;
import model.EmailCmd;

public interface EmailService {

    Boolean send(EmailCmd email);
}
