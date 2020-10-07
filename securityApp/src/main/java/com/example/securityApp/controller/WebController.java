package com.example.securityApp.controller;

import com.example.securityApp.model.User;
import com.example.securityApp.service.MyUserDetails;
import com.example.securityApp.service.UserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {


    @Autowired
    MyUserDetails userInterface;

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login"); // resources/template/login.html
        return modelAndView;
    }

    @RequestMapping(value = "/adminPage", method = RequestMethod.GET)
    public ModelAndView admin() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminPage");
        return (modelAndView);

    }

    @RequestMapping(value = "/userPage", method = RequestMethod.GET)
    public ModelAndView userPage(Model model) {

        List<User> loginName = userService.listAll();
        model.addAttribute("loginName", loginName);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userPage");
        return (modelAndView);

    }

}
