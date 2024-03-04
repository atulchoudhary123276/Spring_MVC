package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration
@ComponentScan(basePackages = "com.firstExample.Controller")
public class SpringMvcConfig {
    @Bean            //view resolver bean
    public InternalResourceViewResolver vm(){
        InternalResourceViewResolver v=new InternalResourceViewResolver();
        v.setPrefix("/WEB-INF/views/");
        v.setSuffix(".jsp");
        return v;
    }
}
