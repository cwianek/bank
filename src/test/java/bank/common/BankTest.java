package bank.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    @Test
    public void addAccount() throws Exception {
        User user = new User(1);
        Bank bank = new Bank();
        bank.addAccount(user);
        assertTrue(bank.getBankAccountList().size() == 1);
    }



}