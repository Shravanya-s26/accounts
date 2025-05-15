package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.dto.CustomerDTO;
import org.springframework.stereotype.Service;


public interface AccountService {
    String createAccount(AccountsDTO accountsDTO);

    AccountsDTO getAccountData();
}
