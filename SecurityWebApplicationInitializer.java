package com.sheridancollege.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import com.sheridancollege.security.config.SecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}

}
