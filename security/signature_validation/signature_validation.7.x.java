// Install the Java helper library from twilio.com/docs/java/install
import java.util.HashMap;
import java.util.Map;

import com.twilio.security.RequestValidator;

public class Example {
  public static void main(String[] args) {
    // Your Auth Token from twilio.com/user/account
    String authToken = "12345";

    // Initialize the validator
    RequestValidator validator = new RequestValidator(authToken);

    // The Twilio request URL
    String url = "https://mycompany.com/myapp.php?foo=1&bar=2";

    // The post variables in Twilio's request
    Map<String, String> params = new HashMap<>();
    params.put("CallSid", "CA1234567890ABCDE");
    params.put("Caller", "+14158675310");
    params.put("Digits", "1234");
    params.put("From", "+14158675310");
    params.put("To", "+18005551212");

    // The X-Twilio-Signature header attached to the request
    String twilioSignature = "RSOYDt4T1cUTdK1PDd93/VVr8B8=";

    System.out.println(validator.validate(url, params, twilioSignature));
  }
}
