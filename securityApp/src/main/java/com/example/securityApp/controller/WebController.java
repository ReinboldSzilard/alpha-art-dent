package com.example.securityApp.controller;

import com.example.securityApp.service.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    MyUserDetails userService;

    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
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
    public ModelAndView user() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userPage");
        return (modelAndView);

    }
}






//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public void loginPageRedirect(HttpServletRequest request, HttpServletResponse response, Authentication authResult) throws IOException, ServletException {
//
//        String role = authResult.getAuthorities().toString();
//
//        if (role.contains("ADMIN")) {
//            response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/index"));
//        } else if (role.contains("USER")) {
//            response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/index"));
//        }
//    }
////
////}
////
////
