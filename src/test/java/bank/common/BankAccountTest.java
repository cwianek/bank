package bank.common;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void changeBalance() throws Exception {
        User user = new User(1);
        BankAccount bankAccount = new BankAccount(user);
        int amount = 2000;
        Operation operationForUser1 = new Operation(new BigDecimal(amount), OperationType.PAYMENT);
        bankAccount.changeBalance(operationForUser1);
        assertTrue(bankAccount.getBalance().intValue() == amount);
    }

}