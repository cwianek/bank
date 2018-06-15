package bank.common.Raports;

import bank.common.Bank.Bank;
import bank.common.Bank.IAccount;
import bank.common.Product.Credit;
import bank.common.Product.IProduct;
import bank.common.Product.Investment;

public class InvestRaport implements IRaport {
    @Override
    public void Visit(Bank bank) {
        int count = 0;
        float sum = 0;
        for (IAccount a : bank.getAccounts()){
            for (IProduct p : a.getInnerProducts()){
                if(p instanceof Investment){
                    count++;
                    sum+=p.getBalance();
                }
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
