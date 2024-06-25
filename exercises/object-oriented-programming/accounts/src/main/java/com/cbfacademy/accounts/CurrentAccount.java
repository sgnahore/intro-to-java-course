package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    protected double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;

    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit >= 0 + overdraftLimit
        ) {
            this.overdraftLimit = overdraftLimit;
        }
    }
}
