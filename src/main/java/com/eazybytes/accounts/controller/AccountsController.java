package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountsController {
    @Autowired
    AccountService accountService;

    @PostMapping("/saveaccountdata")//C
    public String saveData(@RequestBody AccountsDTO accountsDTO) {

        String message = accountService.createAccount(accountsDTO);
        return message;
    }

    @PutMapping("/updateaccountdata")//U
    public String updateData(@RequestBody AccountsDTO accountsDTO) {

        String message = accountService.createAccount(accountsDTO);
        return message;
    }


    @GetMapping("/getaccountdata")//R
    public AccountsDTO getdata() {

        AccountsDTO response = accountService.getAccountData();
        return response;
    }
 @DeleteMapping("/deleteAccount")//D
    public String deleteDustomerid(@RequestParam Long accountID ) {
     String response = accountService.deleteAccountData(accountID);
     return response;
 }
}