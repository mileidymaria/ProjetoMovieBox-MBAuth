package com.mb.auth.security;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableAutoConfiguration
public class ApplicationSecurityConfig {

//    https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
//    https://docs.spring.io/spring-security/site/docs/3.0.x/reference/web-app-security.html
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/", "/login")
                .authenticated()
                .and()
                .httpBasic(withDefaults());
        return http.build();
    }
}
