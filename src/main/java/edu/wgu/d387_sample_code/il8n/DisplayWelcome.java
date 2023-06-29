package edu.wgu.d387_sample_code.il8n;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Repository
public class DisplayWelcome {

    private static List<String> welcomeMessages = new ArrayList<>();

    public static void addMessage(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("language", locale);
        welcomeMessages.add(rb.getString("welcomeMessage"));

    }

    public static List<String> getWelcome() {
        return welcomeMessages;
    };
}
