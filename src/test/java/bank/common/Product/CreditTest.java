package bank.common.Product;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Interest.LinearInterest;
import bank.common.Operation.CreditOperation;
import bank.common.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CreditTest {

    @Test
    void getCreditTest() throws BankException {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        new CreditOperation(account, 1000, 2,new LinearInterest(3));
        assertTrue(account.getBalance() == 1000);
    }
}