package co.istad.thymeleaf.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/article")
    String viewArticle(){
        return "/pages/article";
    }
}
