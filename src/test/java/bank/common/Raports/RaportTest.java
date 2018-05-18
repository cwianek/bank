package bank.common.Raports;

import bank.common.Bank.Bank;
import bank.common.Bank.BankAccount;
import bank.common.Bank.IAccount;
import bank.common.Interest.LinearInterest;
import bank.common.Operation.CreditOperation;
import bank.common.Operation.InvestmenOperation;
import bank.common.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaportTest {
    @Test
    void visit() {
        Bank bank = new Bank();
        IAccount account = bank.addAccount(new User(0));

        new CreditOperation(account,1000, 2, new LinearInterest(3));
        new CreditOperation(account,2000,2,new LinearInterest(3));
        new InvestmenOperation(account,3500,2,new LinearInterest(3));
        IRaport raport = new CreditRaport();
        bank.accept(raport);
    }

}