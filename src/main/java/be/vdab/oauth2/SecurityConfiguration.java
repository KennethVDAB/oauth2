package be.vdab.oauth2;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.oauth2Login();
        http.authorizeRequests(requests -> requests
                .mvcMatchers("/")
                .permitAll()
                .mvcMatchers("/beveiligd")
                .authenticated());
    }
}
