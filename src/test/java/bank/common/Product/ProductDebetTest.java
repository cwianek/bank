package bank.common.Product;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Interest.DifferentInterest;
import bank.common.Operation.InvestmenOperation;
import bank.common.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class ProductDebetTest {
    @Test
    void changeBalance() throws BankException {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        account.setBalance(10);
        IProduct iProduct = new ProductDebet(account, 100);
        iProduct.changeBalance(-80);

        assertTrue(((ProductDebet) iProduct).getDebet() == 70);

        iProduct.changeBalance(100);
        assertTrue(account.getBalance() == 30);
    }

    @Test
    void changeBalance2() {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        account.setBalance(10);
        IProduct iProduct = new ProductDebet(account, 100);
        try {
            iProduct.changeBalance(-200);
            fail();
        }
        catch (BankException e) {
            assertTrue(e.getClass() == BankException.class);
        }
    }

}