package com.example.InMemorySpringSecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		UserDetails ramesh = User.builder()
							 .username("ramesh")
							 .password(passwordEncoder().encode("abc123"))
							 .roles("USER")
							 .build();
		
		UserDetails mukesh = User.builder()
								.username("mukesh")
								.password(passwordEncoder().encode("xyz789"))
								.roles("ADMIN","USER")
								.build();
		
		return new InMemoryUserDetailsManager(ramesh, mukesh);
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {		
		
		http.csrf().disable().authorizeHttpRequests((authorize) -> {			
			authorize.requestMatchers("/api/admin").hasRole("ADMIN"); // ADMIN can access /api/admin (POST,PUT,GET...)
			authorize.requestMatchers(HttpMethod.POST, "/api/user").hasRole("ADMIN"); // To create a new user, only ADMIN can do it.
			authorize.requestMatchers(HttpMethod.GET, "/api/user").hasRole("USER"); // User can only view/read the /api/user api.
			authorize.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults());
		return http.build();
		
	}
	
}
