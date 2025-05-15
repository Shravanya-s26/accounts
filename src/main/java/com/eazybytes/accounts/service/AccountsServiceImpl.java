package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountService {

    @Autowired
    AccountsRepository accountsRepository;
    @Override
    public String createAccount(AccountsDTO accountsDTO) {
        Accounts acc =new Accounts();
        acc.setAccountNumber(accountsDTO.getAccountNumber());
        acc.setCustomerId(accountsDTO.getCustomerId());
        acc.setAccountType(accountsDTO.getAccountType());
        acc.setBranchAddress(accountsDTO.getBranchAddress());

        //dto(neighbour) to entity (you)
        accountsRepository.save(acc);

        return "Saved Successfully";
    }

    @Override
    public AccountsDTO getAccountData() {
       List<Accounts> listOfAllData =  accountsRepository.findAll();
        AccountsDTO accountsDTO = new AccountsDTO();
        accountsDTO.setAccountNumber(listOfAllData.get(0).getAccountNumber());
        accountsDTO.setCustomerId(listOfAllData.get(0).getCustomerId());
        accountsDTO.setBranchAddress(listOfAllData.get(0).getBranchAddress());
        accountsDTO.setAccountType(listOfAllData.get(0).getAccountType());
        //listOfAllData.get(0);
        return accountsDTO;
    }
}
