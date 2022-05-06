package app.projects.starter.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FrontendController {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/select")
    public String select (Model model){
        return "select";


    }
}