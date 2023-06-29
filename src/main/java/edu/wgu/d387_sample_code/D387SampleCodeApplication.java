package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.il8n.DisplayWelcome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);
		//asynchronous calls to DisplayWelcome to generate welcome messages in English and French
		Runnable eng = () -> {
			Locale locale = new Locale("en", "US");
			DisplayWelcome.addMessage(locale);
		};
		Runnable fr = () -> {
			Locale locale = new Locale("fr", "CA");
			DisplayWelcome.addMessage(locale);
		};
		Thread t1 = new Thread(eng);
		Thread t2 = new Thread(fr);
		t1.start();
		t2.start();
	}

}
