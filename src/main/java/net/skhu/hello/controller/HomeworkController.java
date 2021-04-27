package net.skhu.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeworkController {

    @GetMapping("/homework/test1")
    public String test1(Model model) {
        model.addAttribute("num", 1);
        return "homework/test1";
    }

    @PostMapping("/homework/test1")
    public String test1(Model model, Integer num) {
        model.addAttribute("num", num + 1);
        return "homework/test1";
    }

    @GetMapping("/homework/test2")
    public String test2(Model model) {
        model.addAttribute("num", "one");
        return "homework/test2";
    }

    @PostMapping("/homework/test2")
    public String test2(Model model, String num) {
        model.addAttribute("num", num);
        return "homework/test2";
    }
}
