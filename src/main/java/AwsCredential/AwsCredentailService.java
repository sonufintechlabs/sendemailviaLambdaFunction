package AwsCredential;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

@Singleton
public class AwsCredentailService implements AWSCredentialsProvider {
    String accessKey = "AKIAIIY4EZJTUJP67OTQ";
    String secretKey = "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 ";

    @Override
    public AWSCredentials getCredentials() {
        return new BasicAWSCredentials(accessKey, secretKey);
    }
   @Override
    public void refresh() {

    }


}
