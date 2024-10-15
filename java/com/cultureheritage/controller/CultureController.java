package com.cultureheritage.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api")
public class CultureController {

    @GetMapping("/tourism")
    public ResponseEntity<Map<String, String>> getTourismContent() {
        Map<String, String> response = new HashMap<>();
        response.put("title", "Beautiful Tourism Places");
        response.put("description", "Discover India’s most iconic tourist destinations like the Taj Mahal, Jaipur’s forts, and more!");
        return ResponseEntity.ok(response);
    }
}
