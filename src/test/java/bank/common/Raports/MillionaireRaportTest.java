package bank.common.Raports;

import bank.common.Bank.Bank;
import bank.common.Bank.IAccount;
import bank.common.Interest.LinearInterest;
import bank.common.Operation.CreditOperation;
import bank.common.Operation.InvestmenOperation;
import bank.common.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillionaireRaportTest {
    @Test
    void visit() {
        Bank bank = new Bank();
        IAccount account = bank.addAccount(new User(0));
        IAccount account1 =bank.addAccount(new User(1));
        IAccount account2 =bank.addAccount(new User(2));
        IAccount account3 =bank.addAccount(new User(3));
        account.setBalance(1000001);
        account1.setBalance(1);
        account2.setBalance(100099901);
        account3.setBalance(211000001);
        IRaport raport = new MillionaireRaport();
        bank.accept(raport);
    }

}