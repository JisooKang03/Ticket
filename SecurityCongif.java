package com.sheridancollege.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig {
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
