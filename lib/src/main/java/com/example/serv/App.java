package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDN9Mr9eDK_hrMf6E3aR7p0dl5zgecMQM0";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bF45oYvR_kReNkPX7Po7LNWlU5Ooq-st-vEgi6MAwWJnuodDsK8TeeJ6XAiVkiT31d344A9z-LD67yv29HFJHCpnpYMRW8R8gss6nCH-jbUncnT_1GsS6nHdIltMyB7EuR3FgDz");

        c.createData("Working!!", "Test message");

        return c;
    }
}

