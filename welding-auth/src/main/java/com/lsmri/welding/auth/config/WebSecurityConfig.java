package com.lsmri.welding.auth.config;

import com.lsmri.welding.auth.component.CustomizeAccessDeniedHandler;
import com.lsmri.welding.auth.component.CustomizeAuthenticationEntryPoint;
import com.lsmri.welding.auth.component.JwtAuthenticationTokenFilter;
import com.lsmri.welding.auth.util.JwtTokenUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-13
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        List<String> ignoreUrlList = ignoreUrlsConfig().getUrls();
        String[] ignoreUrlArray = ignoreUrlList.toArray(new String[ignoreUrlList.size()]);
        web.ignoring().antMatchers(ignoreUrlArray);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 允许跨域访问
                .cors()
                // 关闭跨站请求防护
                .and().csrf().disable()
                // 任何请求都需要身份认证
                .authorizeRequests().anyRequest().authenticated()
                // 异常处理（未登录、权限拒绝等）
                .and().exceptionHandling()
                .authenticationEntryPoint(authenticationEntryPoint())
                .accessDeniedHandler(accessDeniedHandler())
                // 不使用session
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public IgnoreUrlsConfig ignoreUrlsConfig() {
        return new IgnoreUrlsConfig();
    }

    @Bean
    public AuthenticationEntryPoint authenticationEntryPoint() {
        return new CustomizeAuthenticationEntryPoint();
    }

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new CustomizeAccessDeniedHandler();
    }

    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
        return new JwtAuthenticationTokenFilter();
    }

    @Bean
    public JwtTokenUtil jwtTokenUtil() {
        return new JwtTokenUtil();
    }

}
