package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyC_oi5v-QwyHirz_xbDzwcdcAROWrZ-xwc";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bGNKqkUQsqv3-Yjh2f84U8Z9v4z6hQ1XUy2g9pDztwGcB28SITCZFBPKgUGVJOvu-oYUyt--fdKiEuxq45vJRZjPYrvYUXQOe9Q0xmBpwofNUTjVNitQW3A1D16rlN0xeoszsZa");

        c.createData("Working!! BALLE BALLE", "Test message");

        return c;
    }
}

