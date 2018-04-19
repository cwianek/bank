package bank.common.Operation;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class WithdrawOperationTest {

    @Test
    void withDrawOperation() {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        account.setBalance(1000);
        new WithdrawOperation(account,1000);
        assertTrue(account.getBalance() == 0);
    }

}