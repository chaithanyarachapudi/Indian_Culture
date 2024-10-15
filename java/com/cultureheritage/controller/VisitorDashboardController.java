package com.cultureheritage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitorDashboardController {

    @GetMapping("/visitor-dashboard")
    public String showVisitorDashboard() {
        return "visitor-dashboard";
    }
}
