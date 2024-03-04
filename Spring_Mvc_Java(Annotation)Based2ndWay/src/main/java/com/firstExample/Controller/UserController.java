package com.firstExample.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/userDetails")
    public ModelAndView userDetails(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("userDetails");
        // Add attributes to the model
        modelAndView.addObject("username", request.getParameter("username"));
        modelAndView.addObject("password", request.getParameter("password"));
        return modelAndView;
    }
}
