package com.eazybytes.accounts.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AccountsDTO {


    private Long accountNumber;


    private String accountType;


    private String branchAddress;
}