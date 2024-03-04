package com.logicbig.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;

@Controller
public class MyController {
    @Autowired
    private VisitorInfo visitorInfo;

    @RequestMapping("/")
    public String appHandler(Model model) {
        if (visitorInfo.getName() == null) {
            return "main";
        }
        model.addAttribute("visitor", visitorInfo);
        visitorInfo.increaseVisitorCounter();
        return "app-page";
    }

    @PostMapping("/visitor")
    public String visitorHandler(String name) {
        visitorInfo.setName(name);
        visitorInfo.setFirstVisitTime(LocalDateTime.now());
        return "redirect:/";
    }
}