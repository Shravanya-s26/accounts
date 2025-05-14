package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountsController {
    @Autowired
    AccountService accountService;
    @PostMapping
    public String Hello(){
        AccountsDTO accountsDTO= new AccountsDTO();
        String message = accountService.createAccount(accountsDTO);
        return message;
    }
}
