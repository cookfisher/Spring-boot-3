package com.atguigu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/well")
    public String hello(@RequestParam("name") String name, Model model){

        String text = "<span style='color:red'>"+name+"</span>";
        model.addAttribute("msg", text);
        model.addAttribute("name", name);
        model.addAttribute("imgUrl", "/static/2.jpg");
        model.addAttribute("style", "width: 400px");
        model.addAttribute("show", true);
        return "welcome";
    }
}
