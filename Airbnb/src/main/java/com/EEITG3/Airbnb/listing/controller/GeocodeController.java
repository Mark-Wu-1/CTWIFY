package com.EEITG3.Airbnb.listing.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RestController
@RequestMapping("/api/geocode")
public class GeocodeController {



    @GetMapping
    public ResponseEntity<?> geocode(@RequestParam String address) {
        try {
            if (address == null || address.trim().isEmpty()) {
                return ResponseEntity.badRequest().body("地址為空");
            }

            String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&key=" + GOOGLE_API_KEY;


            System.out.println("Geocoding URL: " + url);


            RestTemplate restTemplate = new RestTemplate();
            Map<String, Object> result = restTemplate.getForObject(url, Map.class);

            return ResponseEntity.ok(result);
        } catch (Exception e) {

            e.printStackTrace(); // 印出錯誤

            return ResponseEntity.status(500).body("Geocoding error: " + e.getMessage());
        }
    }

   
    
    @GetMapping("/autocomplete")
    public ResponseEntity<?> autocomplete(@RequestParam String input) {
        try {
            if (input == null || input.trim().isEmpty()) {
                return ResponseEntity.badRequest().body("輸入為空");
            }

            String encodedInput = URLEncoder.encode(input, StandardCharsets.UTF_8);
            String url = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input=" 
                    + encodedInput
                    + "&key=" + GOOGLE_API_KEY;

            System.out.println("🔍 Autocomplete URL: " + url);

            RestTemplate restTemplate = new RestTemplate();
            Map<String, Object> result = restTemplate.getForObject(url, Map.class);

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Autocomplete error: " + e.getMessage());
        }
    }
}
