package bank.common.Product;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class ProductDebetTest {
    @Test
    void changeBalance() {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        account.setBalance(10);
        IProduct iProduct = new ProductDebet(account, 100);
        iProduct.changeBalance(-80);

        assertTrue(((ProductDebet) iProduct).getDebet() == 70);

        iProduct.changeBalance(100);
        assertTrue(account.getBalance() == 30);
    }
}