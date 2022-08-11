package com.Unicorn.WimpsStore.myBank;

public class Account {

   public String getName;
    private String number;

    private String name;

    private String pin;
    private int Balance;

    public Account(String accountNumber, String accountName, String accountPin){
        name = accountName;
        number = accountNumber;
        pin = accountPin;
    }



    public void deposit(int amount){
        if (amount >0)
            Balance = getBalance(String.valueOf(1234))+amount;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin)) return Balance;
        return 0;
    }

    public void withdraw( int amount, String pin) {
        if(pin == this.pin){
            Balance = Balance - amount;
        }
        else
            Balance = 0;

    }

    public Account(String getName) {
        this.getName = getName;
    }

    public String getGetName() {
        return getName;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
