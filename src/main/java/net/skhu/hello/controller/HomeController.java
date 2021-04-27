package net.skhu.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/home/index")
    public String index(Model model) {
        model.addAttribute("message", "좋은 아침 입니다.");
        model.addAttribute("now", new Date());
        return "home/index";
    }

    @GetMapping("/home/test1")
    public String test1(Model model) {
        model.addAttribute("myName", "DunDung");
        return "home/test1";
    }
}
