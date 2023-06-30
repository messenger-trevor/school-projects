package edu.wgu.d387_sample_code.il8n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/times")
public class TimeConversionController {

    private final TimeConversion timeConversion;

    public TimeConversionController(TimeConversion timeConversion) {
        this.timeConversion = timeConversion;
    }

    @GetMapping
    private String get() { return this.timeConversion.getTimes(); };
}
