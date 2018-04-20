package bank.common.Product;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.Interest.DifferentInterest;
import bank.common.Interest.LinearInterest;
import bank.common.Operation.CreditOperation;
import bank.common.Operation.InvestmenOperation;
import bank.common.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class InvestmentTest {

    @Test
    void investmentTest() {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        account.setBalance(1000);
        new InvestmenOperation(account, 30000, 2, new DifferentInterest(10));
        assertTrue(account.getBalance() == 0);
    }

}