package com.gujun.springboot04;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@SpringBootApplication
public class Springboot04Application extends WebMvcConfigurationSupport {

//    @Value("${system.password.secret}")
//    private String secret;

    public static void main(String[] args) {
        SpringApplication.run(Springboot04Application.class, args);
    }

    //测试Bean，来获取加密后的密码；
//    @Bean
//    public Object test(){
//        System.out.println(secret);
//        PasswordEncoder passwordEncoder=new Pbkdf2PasswordEncoder(secret);
//        System.out.println(passwordEncoder.encode("123456"));
//        System.out.println(passwordEncoder.encode("root"));
//        return new Object();
//    }

    //配置fastjson
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //1、定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2、添加fastjson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3、在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //4、将convert添加到converters中
        converters.add(fastConverter);
        //5、追加默认转换器
        super.addDefaultHttpMessageConverters(converters);
    }

    //配置静态文件映射
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

}
