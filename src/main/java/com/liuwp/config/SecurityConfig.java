package com.liuwp.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Author: liuwuping
 * Date: 17/3/26
 * Description:http://shengwangi.blogspot.jp/2016/02/how-to-use-h2-embeded-database-in-spring.html
 */
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll();
        http.authorizeRequests().antMatchers("/**").hasRole("admin").and().formLogin();
        // add this line to use H2 web console
        http.headers().frameOptions().disable();
    }
}
