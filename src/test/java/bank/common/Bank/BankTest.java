package bank.common.Bank;

import bank.common.BankExceptions.BankException;
import bank.common.Operation.TransferOperation;
import bank.common.User;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;

public class BankTest {

    Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void addAccountTest() {
        User user = new User(0);
        bank.addAccount(user);
        assertNotNull(bank.getAccount(user));
    }

    @Test
    void bankHistoryTest() throws BankException {
        User user1 = new User(0);
        User user2 = new User(0);
        IAccount account1 = new BankAccount(user1);
        IAccount account2 = new BankAccount(user2);
        new TransferOperation(account1,account2, 100);
        assertTrue(Bank.getBankHistory().getOperationList().size() == 3);
    }
}