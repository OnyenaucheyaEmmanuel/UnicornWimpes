package com.Unicorn.WimpsStore.myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BankTest {
    private Bank wemaBank;

    @BeforeEach
    public void startWithThis(){
        wemaBank = new Bank();
    }

    @Test
    public void bankExistTest(){
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest(){
        wemaBank.createAccountFor("Banke Celina Owolabi", "2727");
        assertEquals(1,wemaBank.getNumberOfCustomer());
    }
    @Test
    public void createAccount_findAccountByAcocuntNumberTest(){
        wemaBank.createAccountFor("Banke Celina Owolabi", "2727");
        assertEquals(1,wemaBank.getNumberOfCustomer());

        Account account = wemaBank.findAccount("1");
        assertEquals("Banke Celina Owolabi", account.getName);

    }

}
