package org.dnyanyog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Means this class will be our main class
public class ApplicationMain {

	public static void main(String args[]) {
		SpringApplication.run(ApplicationMain.class, args); /* Spring application run and run this class
															   (ApplicationMain)on run as java application, Spring's
															   spring boot application starts running on port 8080.
															   In this instruction we are saying consider
															   ApplicationMain class as spring boot application and
															   start running all necessary things required for a spring
															   boot application.*/
	}
}
