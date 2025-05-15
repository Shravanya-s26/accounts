package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountsController {
    @Autowired
    AccountService accountService;
    @PostMapping("/saveaccountdata")
    public String saveData(@RequestBody AccountsDTO accountsDTO){

        String message = accountService.createAccount(accountsDTO);
        return message;
    }

    @PutMapping("/updateaccountdata")
    public String updateData(@RequestBody AccountsDTO accountsDTO){

        String message = accountService.createAccount(accountsDTO);
        return message;
    }


    @GetMapping("/getaccountdata")
    public AccountsDTO getdata(){

        AccountsDTO response = accountService.getAccountData();
        return response;
    }


    ///  you will be creating delete mapping here
}
