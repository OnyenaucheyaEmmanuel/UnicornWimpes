package com.Unicorn.WimpsStore.myBnak;

import com.Unicorn.WimpsStore.myBank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    private Account bankeAccount;

    @BeforeEach
    public void startWithThis() {
        //account = new Account();
        bankeAccount = new Account("1", "Banke", "1234");
    }


    @Test
    public void accountCanBeCreatedTest() {
        //given that aacount exixts
        // check that account exixts
        //Account account = new Account();
        assertNotNull(bankeAccount);
        assertEquals(0, bankeAccount.getBalance(String.valueOf(1234)));
    }


    @Test
    public void depositMoney_balanceIncreasedTest() {
        //given that i have account and balance is zero;
        //when i deposit  200
        //check that balance is 200
        // Account bankeAccount = new Account();
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance(String.valueOf(1234)));

    }

    @Test
    public void cannotDepositNegativeAmountTest() {
        //given that i have account and balance is zero;
        //when i deposit  -2500
        //check that balance is zero
        //Account bankeAccount = new Account();
        assertEquals(0, bankeAccount.getBalance(String.valueOf(1234)));
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance(String.valueOf(1234)));
    }

    @Test
    @DisplayName("Getting balance with invalid pin return zero")
    public void getBalanceWithWrongPin_returnZeroTest() {
        //given i have money in my account
        //when o check balance is wrong pin
        //balance is zeero
        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.getBalance(String.valueOf(1234));
        assertEquals(2000, myBalance);

    }

    @Test
    // given that i can withdraw from my account
    // when my pin is correct
    //check balance  is deducted

    public void withdrawWithValidPin() {

        bankeAccount.deposit(5000);
        bankeAccount.withdraw(2000, "1234");
        assertEquals(3000, bankeAccount.getBalance(String.valueOf(1234)));


    }
    @Test
    public void withdrawWithInvalidPin() {

        bankeAccount.deposit(5000);
        bankeAccount.withdraw(2000, "1254");
        assertEquals(0, bankeAccount.getBalance(String.valueOf(1234)));


    }

}