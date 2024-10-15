package com.cultureheritage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/login")
    public String login(
        @RequestParam("username") String username, 
        @RequestParam("password") String password, 
        Model model) {
        
        // Mock authentication logic (you'll want to replace this with real authentication)
        if ("admin".equals(username) && "adminpass".equals(password)) {
            // Redirect to admin dashboard for admin credentials
            return "redirect:/admin-dashboard";
        } else if ("visitor".equals(username) && "visitorpass".equals(password)) {
            // Redirect to visitor dashboard for normal user credentials
            return "redirect:/visitor-dashboard";
        } else {
            // If credentials are wrong, return back to the login page with an error message
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
