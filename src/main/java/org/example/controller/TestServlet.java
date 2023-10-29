package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestServlet {
    @RequestMapping("/hello")
    @ResponseBody
    public String helloPage(){
        return "Hello World";
    }




}
