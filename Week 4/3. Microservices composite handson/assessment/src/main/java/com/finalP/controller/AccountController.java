package com.finalP.controller;
import com.finalP.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {

        return new Account(number, "savings", 234343);
    }
}