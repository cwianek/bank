package bank.common.Raports;

import bank.common.Bank.Bank;
import bank.common.Bank.IAccount;
import bank.common.Product.Credit;
import bank.common.Product.IProduct;
import bank.common.Product.Investment;

public class MillionaireRaport implements IRaport {

    @Override
    public void Visit(Bank bank) {
        int count = 0;
        for (IAccount a : bank.getAccounts()) {

            if (a.getBalance() > 1000000) {
                count++;
            }
        }
        System.out.println(count);
    }
}
