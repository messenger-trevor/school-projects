package edu.wgu.d387_sample_code.il8n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/welcome")
@CrossOrigin
public class WelcomeController {

    private final DisplayWelcome displayWelcome;

    public WelcomeController (DisplayWelcome displayWelcome) {
        this.displayWelcome = displayWelcome;
    }

    @GetMapping
    public List<String> get() {
        return displayWelcome.getWelcome();
    }
}
