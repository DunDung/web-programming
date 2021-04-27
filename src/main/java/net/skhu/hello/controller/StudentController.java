package net.skhu.hello.controller;

import net.skhu.hello.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @GetMapping("/student/edit")
    public String edit(Model model) {
        return "student/edit";
    }

    @PostMapping("/student/edit")
    public String edit(Model model, Student student, HttpSession httpSession) {
        String errorMsg = "";
        if (student.getEmail().isEmpty() || student.getEmail() == null) {
            errorMsg = "이메일 주소를 입력하세요.";
        } else if (student.getDepartmentId() == 0) {
            errorMsg = "전공을 선택하세요.";
        } else {
            httpSession.setAttribute("student", student);
            return "redirect:edit_success";
        }
        model.addAttribute("errorMsg", errorMsg);
        model.addAttribute("student", student);
        return "student/edit";
    }

    @GetMapping("/student/edit_success")
    public String editSuccess(Model model) {
        return "student/edit_success";
    }
}
