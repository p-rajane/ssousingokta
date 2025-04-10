package com.sso.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsousingoktaApplication {

	@GetMapping("/user")
	public String getUser() {
		return "Hi Pramod !!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SsousingoktaApplication.class, args);
	}

}
