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
        PersonDto person = new PersonDto("Damian", "Nguyen", 27);

//        model.addAttribute("name", person.getName());
//        model.addAttribute("surname", person.getSurname());
//        model.addAttribute("age", person.getAge());
        model.addAttribute("person", person);

        return "home";
    }
}
