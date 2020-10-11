package com.damiannguyen.modules.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
//    @RequestMapping("/")
//    @RequestMapping( method = RequestMethod.GET, path = "/")
    @RequestMapping( method = RequestMethod.GET, path = {"/", "index.html"})
    public String getHome(Model model) {
        PersonDto person = new PersonDto("Damian", "Nguyen", 27);
        PersonDto person2 = new PersonDto("Paulina", "Buczkowska", 26);
        PersonDto person3 = new PersonDto("Iliana", "Parasiak", 8);

        List<PersonDto> personDtoList = List.of(person, person2, person3);

        //Polami
//        model.addAttribute("name", person.getName());
//        model.addAttribute("surname", person.getSurname());
//        model.addAttribute("age", person.getAge());

        //Obiektami
//        model.addAttribute("person", person);

        //Listami
        model.addAttribute("personList", personDtoList);

        return "home";
    }
}
