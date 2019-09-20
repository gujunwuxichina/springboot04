package com.gujun.springboot04.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    /*
        用于配置用户信息的方法，若没有配置则会自动生成一个user、密码随机生成的用户；
        1.使用内存签名服务，用户信息放在内存中；
        用户详情构造器UserDetailsBuilder方法：
        accountExpire(boolean),设置账号是否过期；
        accountLocked(boolean),设置账号是否锁定；
        credentialsExpire(boolean),设置凭证是否过期；
        disabled(boolean),是否禁用用户；
        username(String)，定义用户名；
        authorities(GrantedAuthority...),赋予权限；
        authorities(List<? extneds GrantedAuthority>),使用列表List赋予权限;
        password(String),定义密码；
        roles(String..),赋予角色，会加上ROLE_前缀；
     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();    //密码编码器,该实现类采用的单向不可逆的加密方式
//        //使用内存存储
//        auth.inMemoryAuthentication()   //返回内存保存用户信息的管理器配置
//            .passwordEncoder(passwordEncoder)   //设置密码编码器
//            .withUser("gujun")  //注册用户名称，并返回用户详情配置器（用户详情构造器）
//            .password(passwordEncoder.encode("root"))   //设置密码，加密后的
//            .roles("USER","ADMIN")  //roles()赋予的角色名称会加上ROLE_前缀
//            .and()  //连接方法，开启另外一个用户注册；
//            .withUser("li")
//            .password(passwordEncoder.encode("123456"))
//            .roles("USER");
//    }

    /*
        2.使用数据库定义用户认证服务：
        为此Spring Security提供了对数据库的查询方法；
        JdbcUserDetailsManagerConfigurer是一个Spring Security对于数据库配置的支持，提供了默认SQL(很少用)；
     */



}
