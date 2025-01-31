package com.example.serachBook.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
=======
import org.springframework.security.web.SecurityFilterChain;

@Configuration

>>>>>>> develop
public class SecurityConfig {

    // SecurityFilterChain for Spring Boot 2.x & Spring Security 5.x+
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
<<<<<<< HEAD
        .authorizeHttpRequests(auth -> auth
        	.requestMatchers("/").permitAll()
        	.requestMatchers("/index").permitAll()
        	.requestMatchers("/add-book").permitAll()
        	.requestMatchers("/detail-book").permitAll()
            .requestMatchers("/login").permitAll()
            .requestMatchers("/logout").permitAll()
            //.requestMatchers("/admin/**").hasRole("ADMIN")
            //.requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
            .anyRequest().authenticated()
        )
        .formLogin(form -> form
            .loginPage("/login")
            .defaultSuccessUrl("/", true)
            
        )
        .logout(logout -> logout.logoutUrl("/logout").logoutSuccessUrl("/login?logout"));
    return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
=======
            .csrf().disable()  // Disable CSRF (for testing, not recommended in production)
            .authorizeRequests()
            .requestMatchers("/**").permitAll()  // Allow all access to book routes
            .anyRequest().authenticated();  // Other routes require authentication
        return http.build();
>>>>>>> develop
    }
}
