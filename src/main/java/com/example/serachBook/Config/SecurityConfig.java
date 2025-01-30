package com.example.serachBook.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {

    // SecurityFilterChain for Spring Boot 2.x & Spring Security 5.x+
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()  // Disable CSRF (for testing, not recommended in production)
            .authorizeRequests()
            .requestMatchers("/**").permitAll()  // Allow all access to book routes
            .anyRequest().authenticated();  // Other routes require authentication
        return http.build();
    }
}
