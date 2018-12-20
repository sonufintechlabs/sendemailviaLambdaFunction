package mail;

import AwsCredential.AwsCredentailService;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.*;
import example.micronaut.ViesVatValidatorFunction;
import model.EmailCmd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import io.micronaut.http.HttpResponse;


public class EmailServiceImpl implements EmailService {
    private static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);


    @Override
    public Boolean send(EmailCmd email) {
        logger.info("**********Hiiiii Mailing Services With SES ....haaaaaahahah");
        System.out.println(email.getRecipient());
        System.out.println(email.getSource());
        System.out.println(email.getSubject());
        System.out.println(email.getTextBody());
        Boolean isMailTriggered = false;
        try {
            AWSCredentialsProvider awsCredentailService = new AwsCredentailService();
            String awsRegion = "us-east-1";
            Content content = new Content(email.getSubject());
            Body body = new Body();
            Content contentOfTextBody = new Content(email.getTextBody());
            body.setText(contentOfTextBody);
            Message message = new Message().withSubject(content).withBody(body);
            message.setSubject(content);
            message.setBody(body);
            Destination destination = new Destination().withToAddresses(email.getRecipient());
            SendEmailRequest sendEmailRequest = new SendEmailRequest().withDestination(destination).withSource(email.getSource()).withMessage(message);
            AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder.standard().withCredentials(awsCredentailService).withRegion(awsRegion).build();
            client.sendEmail(sendEmailRequest);
            isMailTriggered = true;
        } catch (Exception ex) {
            System.out.println(ex);
            isMailTriggered = false;
        }
        return isMailTriggered;
    }
}
