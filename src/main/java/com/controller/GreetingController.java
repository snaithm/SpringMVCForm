package com.controller;

import com.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public ModelAndView greetingForm(Model model) {

        model.addAttribute("greeting", new Greeting());
        return new ModelAndView("greeting", "m", model);
    }

    @PostMapping("/greeting")
    public ModelAndView greetingSubmit(@ModelAttribute Greeting greeting) {

        greeting.setName(greeting.getName() + " is now a  registered user");
        return new ModelAndView("result", "m", greeting);
    }
}