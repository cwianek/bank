package bank.common.Operation;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Interest.LinearInterest;
import bank.common.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CreditOperationTest {

    @Test
    void creditProductAddTest() throws BankException {
        IAccount account = new BankAccount(new User(0));

        new CreditOperation(account,1000, 2, new LinearInterest(3));
        assertTrue(account.getInnerProducts().size() == 1);
    }
}