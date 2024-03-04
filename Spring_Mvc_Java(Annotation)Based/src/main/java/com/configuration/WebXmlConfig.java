package com.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebXmlConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //register spring-servlet config file(create webApplicationContext)
        AnnotationConfigWebApplicationContext sms=new AnnotationConfigWebApplicationContext();
        sms.register(SpringMvcConfig.class);

         //create Dispatcher servlet
        DispatcherServlet ds=new DispatcherServlet(sms);
        //register Dispatcher servlet
        ServletRegistration.Dynamic myDs = servletContext.addServlet("MyDs", ds);
                myDs.setLoadOnStartup(1);
                myDs.addMapping("/");
    }
}
