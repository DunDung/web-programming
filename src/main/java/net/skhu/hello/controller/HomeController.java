package net.skhu.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("home/index")
    public String index(Model model) {
        model.addAttribute("message", "좋은 아침 입니다.");
        return "home/index";
    }
}
