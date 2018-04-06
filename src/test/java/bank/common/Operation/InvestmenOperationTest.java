package bank.common.Operation;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.Interest.LinearInterest;
import bank.common.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class InvestmenOperationTest {

    @Test
    void investmentProductAddTest() {
        IAccount account = new BankAccount(new User(0));
        new InvestmenOperation(account,1000, 2, new LinearInterest(3));
        assertTrue(account.getInnerProducts().size() == 1);
    }

}