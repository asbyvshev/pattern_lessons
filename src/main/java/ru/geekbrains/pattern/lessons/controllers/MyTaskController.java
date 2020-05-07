package ru.geekbrains.pattern.lessons.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.pattern.lessons.services.MyTaskService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MyTaskController {

    private final MyTaskService myTaskService;

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index(Model model){
        model.addAttribute("tasks",myTaskService.showTasks());
        return "index";
    }
}
