package bank.common.Raports;

import bank.common.Bank.Bank;
import bank.common.Product.Credit;
import bank.common.Product.Investment;

public interface IRaport {
    public void Visit(Bank bank);
    public void Visit(Credit credit);
    public void Visit(Investment investment);

}
