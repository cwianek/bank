package bank.common.Operation;

import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TransferOperationTest {

    @Test
    void transferFundsOperationTest() throws BankException {
        User user = new User(0);
        IAccount account = new BankAccount(user);
        account.setBalance(1000);
        User externalUser = new User(1);
        IAccount externalAccount = new BankAccount(externalUser);
        externalAccount.setBalance(1000);
        new TransferOperation(account,externalAccount,100);
        assertTrue(externalAccount.getBalance() == 900);
        assertTrue(account.getBalance() == 1100);
    }

}