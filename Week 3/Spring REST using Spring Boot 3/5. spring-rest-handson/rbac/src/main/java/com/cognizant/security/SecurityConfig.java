package com.cognizant.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);
    // Define the Users and Roles
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder.encode("pwd"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("user")
                .password(passwordEncoder.encode("pwd"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    // Define the Password Encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        LOGGER.info("Start passwordEncoder");
        return new BCryptPasswordEncoder();
    }

    // Define the Route Rules 
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .httpBasic(Customizer.withDefaults())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/countries").hasRole("USER")
                .anyRequest().authenticated()
            );
        return http.build();
    }
}