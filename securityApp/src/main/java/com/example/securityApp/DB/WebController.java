package com.example.securityApp.DB;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class WebController {

//    @GetMapping("/")
//    public String userPage(){
//        return "userPage";
//
//    }


    @GetMapping("/")
    public void loginPageRedirect(HttpServletRequest request, HttpServletResponse response, Authentication authResult) throws IOException, ServletException {

        String role = authResult.getAuthorities().toString();

        if (role.contains("ADMIN")) {
            response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/adminPage"));
        } else if (role.contains("USER")) {
            response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/userPage"));
        }
    }

}


