package bank.common;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BankAccountTest {
    User user;
    BankAccount bankAccount;

    @Before
    public void setUp() throws Exception {
        user = new User(1);
        bankAccount = new BankAccount(user);
    }

    @Test
    public void changeBalance() throws Exception {
        int amount = 2000;
        Operation operationForUser1 = new Operation(bankAccount, bankAccount, new BigDecimal(amount), OperationType.PAYMENT);
        bankAccount.changeBalance(operationForUser1);
        assertTrue(bankAccount.getBalance().intValue() == amount);
    }

    @Test
    public void makeCredit() throws Exception {
        AdditonalProduct credit = new Credit();
        credit.
        bankAccount.addAdditonalProduct();
    }

}