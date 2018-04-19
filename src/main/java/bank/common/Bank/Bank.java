package bank.common.Bank;

import bank.common.Operation.OperationHistory;
import bank.common.User;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<IAccount> accounts;
    private static OperationHistory bankHistory = new OperationHistory();

    Bank(){
        accounts = new ArrayList<IAccount>();
    }

    public IAccount addAccount(User user){
        IAccount bankAccount = new BankAccount(user);
        this.accounts.add(bankAccount);
        return bankAccount;
    }

    public IAccount getAccount(User user){
        for(IAccount account: accounts){
            if(account.getOwner().getId() == user.getId())
                return account;
        }
        return null;
    }

    public static OperationHistory getBankHistory() {
        return bankHistory;
    }

}