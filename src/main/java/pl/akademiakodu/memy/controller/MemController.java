package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/favorites")
    public String favorites(){
        return "/favorites";
    }
    @GetMapping("/categories")
    public String categories(){
        return  "/categories";
    }
}
