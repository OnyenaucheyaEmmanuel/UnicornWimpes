package com.Unicorn.WimpsStore.myBank;

public class Bank {

    private int numberOfCustomer;
    private Account[] accounts = new Account[10];
    public void createAccountFor(String accountName, String pin) {

        Account account = new Account((numberOfCustomer + 1) + "",accountName,pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return  numberOfCustomer;
    }


    public Account findAccount(String accountNumber) {
        for(Account account : accounts){
            if (account.getName().equals(accountNumber))
                return account;
        }
        return null;
    }
}
