package com.cultureheritage.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class TourismController {

    @GetMapping("/tourist-places")
    public ResponseEntity<Map<String, Object>> getTouristPlaces() {
        List<Map<String, Object>> states = new ArrayList<>();

        Map<String, Object> up = new HashMap<>();
        up.put("name", "Uttar Pradesh");
        up.put("touristPlaces", Arrays.asList("Taj Mahal, Agra", "Varanasi Ghats", "Fatehpur Sikri"));

        Map<String, Object> rajasthan = new HashMap<>();
        rajasthan.put("name", "Rajasthan");
        rajasthan.put("touristPlaces", Arrays.asList("Jaipur City Palace", "Udaipur Lakes", "Jaisalmer Fort"));

        Map<String, Object> kerala = new HashMap<>();
        kerala.put("name", "Kerala");
        kerala.put("touristPlaces", Arrays.asList("Munnar Hills", "Alleppey Backwaters", "Kochi Fort"));

        states.add(up);
        states.add(rajasthan);
        states.add(kerala);

        Map<String, Object> response = new HashMap<>();
        response.put("states", states);

        return ResponseEntity.ok(response);
    }
}
