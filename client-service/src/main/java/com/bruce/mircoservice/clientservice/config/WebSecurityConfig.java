//package tw.com.bruce.spring.cloud.test.config;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//
//        httpSecurity.csrf().disable();
//
//        httpSecurity.authorizeRequests()
//                    .antMatchers("/api/**")
//                    .permitAll()
//
//                    .and()
//
//                    .authorizeRequests()
//                    .antMatchers("/**")
//                    .authenticated();
//
//        httpSecurity.httpBasic();
//    }
//
//}
