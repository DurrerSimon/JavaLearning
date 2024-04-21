package com.timbuchalka;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() throws Exception{
        BankAccount account = new BankAccount("Simon", "Durrer", 3500000, BankAccount.CHECKING);
        double balance = account.deposit(500000, true);
        assertEquals(4000000, balance, 0);
        assertEquals(4000000, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() throws Exception{
        BankAccount account = new BankAccount("Simon", "Durrer", 3500000, BankAccount.CHECKING);
        account.withdraw(500000, false);
        assertEquals(3000000, 3000000 );

    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() throws Exception{
        BankAccount account = new BankAccount("Simon", "Durrer", 3500000, BankAccount.CHECKING);
        account.deposit(500000, true);
        assertEquals(4000000, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() throws Exception{
        BankAccount account = new BankAccount("Simon", "Durrer", 3500000, BankAccount.CHECKING);
        account.withdraw(500000, true);
        assertEquals(3000000, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Simon", "Durrer", 3500000, BankAccount.CHECKING);
        assertEquals(true, account.isChecking());

    }

    @org.junit.jupiter.api.Test
    public void isSaving_true(){
        BankAccount account = new BankAccount("Simon", "Durrer", 3500000, BankAccount.SAVING);
        assertEquals(true, account.isSaving());

    }
}