package bank.common.Operation;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.Product.IProduct;
import bank.common.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class CloseInvestmentOrCreditOperationTest {

    int amount = 1000;
    int rate = 10;
    IAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(new User(0));
    }

    @Test
    void closeInvestmentOperationTest() {
        new InvestmenOperation(account,amount, 2, rate);
        IProduct investment = account.getInnerProducts().get(0);
        new CloseInvestmentOrCreditOperation(account,investment.getId());
        assertTrue(account.getBalance() == amount +( (float) rate/100*amount));
    }

    @Test
    void closeCreditOperationTest() {
        new CreditOperation(account,amount, 2, rate);
        IProduct credit = account.getInnerProducts().get(0);
        new CloseInvestmentOrCreditOperation(account,credit.getId());
        assertTrue(account.getBalance() == (float) rate/100*-amount);
    }
}