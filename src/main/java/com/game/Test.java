package com.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

    // Add the controller.
    @RestController
        class HelloWorldController {
        @GetMapping("/")
        public String hello() {
            return "Redirect Successful";
        }
    }

}