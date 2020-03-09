package Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
//    deposit(long cents): Adds cents to the bank account
//    withdraw(long cents): Removes cents from the bank account
//    balance(): Returns the current balance on the bank account
//    isOverDrawn(): Returns true if the balance on the account is negative
    public void TestStateAndBehavior() {
        //Setup
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        long Balance = bankAccount.balance();
        boolean isOverDrawn = bankAccount.isOverDrawn();
        //Exercise
        //Assert
        assertEquals(50, Balance);
        assertFalse(isOverDrawn);
        //Teardown
    }

}