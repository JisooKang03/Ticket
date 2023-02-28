package com.sheridancollege.security.controllers;

import com.sheridancollege.security.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/new")
	public String gotoNew() {
		return "new";
	}
	@GetMapping("/register")
	public String login() {
		return "register";
	}

	@GetMapping("/trainticket")
	public String train() {
		return "trainticket";
	}

	@GetMapping("/orderticket")
	public String order(){
		return "orderticket";
	}

	@GetMapping("/Bustime")
	public String bus(){
		return "Bustime";
		}

	@Value("${application.loginUsername}")
	private String username;

	@Value("${application.loginPassword}")
	private String password;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.inMemoryAuthentication()
				// .withUser("JAVA3").password("{noop}secure").roles("ADMIN");
				.withUser(username).password(password).roles("ADMIN");
	}
}
