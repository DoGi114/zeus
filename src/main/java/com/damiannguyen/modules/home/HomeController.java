package com.damiannguyen.modules.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
//    @RequestMapping("/")
//    @RequestMapping( method = RequestMethod.GET, path = "/")
    @RequestMapping( method = RequestMethod.GET, path = {"/", "index.html"})
    public String getHome(Model model) {
        model.addAttribute("name", "Damian");
        return "home";
    }
}
