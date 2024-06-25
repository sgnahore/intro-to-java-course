package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int nextAccountNumber;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber){
                return account;
            }
        }
       return null;
    }
}
 