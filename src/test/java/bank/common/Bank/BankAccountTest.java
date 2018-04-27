package bank.common.Bank;

import bank.common.BankExceptions.BankException;
import bank.common.Operation.WithdrawOperation;
import bank.common.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class BankAccountTest {

    IAccount account;
    int amount = 1000;

    @BeforeEach
    void setUp() {
        User user = new User(0);
        account = new BankAccount(user);
    }

    @Test
    void setBalanceTest() {
        account.setBalance(amount);
        assertTrue(account.getBalance() == amount);
    }

    @Test
    void doOperationTest() throws BankException {
        account.setBalance(amount);
        new WithdrawOperation(account, amount);
        assertTrue(account.getBalance() == 0);
    }
}