package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements AccountService {

    @Autowired
    AccountsRepository accountsRepository;
    @Override
    public String createAccount(AccountsDTO accountsDTO) {
        Accounts acc =new Accounts();
        acc.setAccountNumber(111L);
        acc.setCustomerId(1L);
        acc.setAccountType("savings");
        acc.setBranchAddress("dcelhi");
        accountsRepository.save(acc);
        return "Saved Successfully";
    }
}
