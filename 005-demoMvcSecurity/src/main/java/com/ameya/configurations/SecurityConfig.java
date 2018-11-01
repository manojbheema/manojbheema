package com.ameya.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("ameya").
		password(passwordEncoder().encode("1234")).roles("USER");
		auth.inMemoryAuthentication().withUser("admin").
		password(passwordEncoder().encode("1234")).roles("ADMIN");
		
		//auth.inMemoryAuthentication().withUser("avani").
		//password(passwordEncoder().encode("1234")).roles("ADMIN","USER");
	}
	//PasswordEncoder Required for spring 5.x or you could use {Noop} after password to specify no password encoder 
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
	  	.antMatchers("/", "/home").permitAll()
	  	.antMatchers("/admin/**").access("hasRole('ADMIN')")
	  	.antMatchers("/common/**").access
	  	("hasRole('ADMIN') or hasRole('USER')")
	  	.and().formLogin().loginPage("/login")
	  	.usernameParameter("userName").passwordParameter("password")
	  	.and().exceptionHandling().accessDeniedPage("/Access_Denied")
	  	.and().csrf().disable();
	}
}
/* All the requests for /resources will be ignored and 
will not be considered for auth & auth
@Override
 public void configure(WebSecurity web) throws Exception {
   web
     .ignoring()
        .antMatchers("/resources/**"); 
 }
 */
//user shud belong to both roles--avani
//.antMatchers("/common/**").access("hasRole('ADMIN') and hasRole('USER')")






