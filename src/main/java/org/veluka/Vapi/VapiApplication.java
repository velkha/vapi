package org.veluka.Vapi;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class VapiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(VapiApplication.class, args);
		SpringApplication app = new SpringApplication(VapiApplication.class);
        app.run(args);
	}

}
