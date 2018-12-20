package example.micronaut;

import io.micronaut.function.FunctionBean;
import mail.Email;
import mail.EmailService;
import mail.EmailServiceImpl;
import model.EmailCmd;
import model.SimpleValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.inject.Inject;
import java.util.function.Function;

@FunctionBean("vies-vat-validator")
public class ViesVatValidatorFunction implements Function<EmailCmd, Boolean> {
    private static final Logger logger = LoggerFactory.getLogger(ViesVatValidatorFunction.class);

    @Override
    public Boolean apply(EmailCmd emailCmd) {
        logger.info("<<<<Welcome to Aws Lambda Function >>>>>>>>>");
        logger.info("<<<<Welcome to Aws Lambda Function >>>>>>>>>");
        logger.info("<<<<Recipient  >>>>>>>>>" + emailCmd.getRecipient());
        logger.info("<<<<Subject >>>>>>>>>" + emailCmd.getSubject());
        logger.info("<<<<Html Body >>>>>>>>>" + emailCmd.getHtmlBody());
        logger.info("<<<<Text Body >>>>>>>>>" + emailCmd.getTextBody());
        EmailService emailService = new EmailServiceImpl();
        Boolean isMailTriggered = emailService.send(emailCmd);
        return isMailTriggered;

    }
}
