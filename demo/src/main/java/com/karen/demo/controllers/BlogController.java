package com.karen.demo.controllers;

import com.karen.demo.models.Post;
import com.karen.demo.repo.Postrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private Postrepository postrepository;

    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts = postrepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }
}
