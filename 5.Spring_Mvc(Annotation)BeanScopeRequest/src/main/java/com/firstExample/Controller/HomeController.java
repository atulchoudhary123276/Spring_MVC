package com.firstExample.Controller;

import com.firstExample.Model.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {
    @Autowired
    private MyBean myBean;
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/req")
    public String home(Model model) {
        model.addAttribute("website",myBean.getWebsite());
        model.addAttribute("content",myBean.setWebsite("newatul.com"));
        model.addAttribute("newWebsite",myBean.getWebsite());
        return "home2";
    }
    @RequestMapping("/req2")
    public String display(Model model) {
        model.addAttribute("website",myBean.getWebsite());
        model.addAttribute("content","new Bean obj created");
        model.addAttribute("newWebsite",myBean.getWebsite());

        return "home2";
    }

}
