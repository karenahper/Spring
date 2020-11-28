package com.karen.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {           //класс обработки на все сайты (о нас, меню и тд)

    @GetMapping("/")                    // знак слеша говорит о том, что это главная страница
    public String home(Model model) {
        model.addAttribute("title", "Главня страница");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }
}