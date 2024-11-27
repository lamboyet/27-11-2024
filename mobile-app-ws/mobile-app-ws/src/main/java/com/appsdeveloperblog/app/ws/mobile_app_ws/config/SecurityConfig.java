package com.appsdeveloperblog.app.ws.mobile_app_ws.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/users/**").permitAll() // Allow unauthenticated access to /public/*
                        .anyRequest().authenticated() // Protect all other endpoints
                )
                .httpBasic(); // Enable basic authentication

        return http.build();
    }

}
