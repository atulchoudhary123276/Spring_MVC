package com.firstExample.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component                    //scope can we use like below 2 method 1.@scope  ,2.@RequestScope
@Scope(value = "request" ,proxyMode = ScopedProxyMode.TARGET_CLASS)
//@RequestScope
public class MyBean {
    private String website="atul.com";

    public MyBean() {
        System.out.println("mybean obj created");
    }

    public String getWebsite() {
        return website;
    }

    public String setWebsite(String website) {
        this.website = website;
        return "set new website name and when u request again , always new Bean obj created";
    }
}
