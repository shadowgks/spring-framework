package org.example.controller;

import org.example.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestServlet {
    TestService testService = new TestService();
    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    @ResponseBody
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
    public String getData(@RequestParam String username,
                          @RequestParam String password,
                          ModelMap model){
        if (testService.checkLogin(username, password)){
            model.put("username", username);
            model.put("password", password);
            return "home";
        }else {
            model.put("ops", "OPS! Your user name or password not correct");
            return "login";
        }
    }


}
