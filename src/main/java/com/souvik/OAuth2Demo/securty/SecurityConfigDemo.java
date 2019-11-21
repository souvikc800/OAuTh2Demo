package com.souvik.OAuth2Demo.securty;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class SecurityConfigDemo extends WebSecurityConfigurerAdapter{
	//Authentication-->create  entity with userid/password and role
	/*protected void configure(AuthenticationManagerBuilder amb) throws Exception{
		
		amb.inMemoryAuthentication().withUser("super").password("{noop}souvik").roles("SUPER");
	}
	*/
    //Authorization-->putting access to roles
	protected void Configure(HttpSecurity http) throws Exception
	{
		http
		.authorizeRequests()
		.anyRequest().fullyAuthenticated();
		http.csrf().disable();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/","/welcome"); // we ignore thsese two URIs as "/" is the !st page and "/welcome"
		//is the page where google will redirect after successful authentication.
	}
	

}
