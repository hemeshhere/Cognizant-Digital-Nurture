package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccountDetails(@PathVariable String number) {
        // Dummy response without backend connectivity
        Map<String, Object> response = new HashMap<>();
        response.put("number", number); // Using the path variable for a dynamic response
        response.put("type", "savings");
        response.put("balance", 234343);
        
        return response;
    }
}