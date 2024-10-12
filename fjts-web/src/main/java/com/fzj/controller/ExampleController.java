package com.fzj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * thymeleaf环境测试
 * @author feizhijie
 * @date 2024/10/12
 */
@Controller
@RequestMapping("/test")
public class ExampleController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        // 对应src/main/resources/templates/greeting.html
        return "greeting";
    }
}
