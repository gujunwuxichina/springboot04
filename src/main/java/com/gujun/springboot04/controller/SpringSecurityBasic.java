package com.gujun.springboot04.controller;

public class SpringSecurityBasic {

    /*
        在Java Web中，通过过滤器Filter对请求进行拦截，然后在Filter中来验证来决定是否放行请求；
        Spring Security也是基于该原理；
        为了对请求进行拦截，Spring Security提供了过滤器DelegatingFilterProxy类给予开发者配置；
        在Spring全注解的方式下，只需加入@EnableWebSecurity就可以启动Spring Security，而在SpringBoot中，
        只需在配置文件中配置就会自动启动Spring Security；
        Spring Security原理：
        一旦启动了Spring Security，SpringIoC容器就会创建一个名为springSecurityFilterChain的Bean,类型为FilterChainProxy,
        实现了Filter接口，是一个特殊的拦截器；
        Spring Security操作过程中会提供Servlet过滤器DelegatingFilterProxy,该过滤器会通过SpringIoC容器去获取Spring Security自动
        创建FilterChainProxy对象，
     */

}
