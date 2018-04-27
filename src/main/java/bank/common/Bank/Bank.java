package bank.common.Bank;

import bank.common.Operation.OperationHistory;
import bank.common.User;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String ibanId;
    private List<IAccount> accounts;
    private static OperationHistory bankHistory = new OperationHistory();
    private static Integer id = 0;
    private static Integer accountsAmount = 0;
    Bank(){
        ibanId = id.toString();  id++;
        accounts = new ArrayList<IAccount>();
    }

    public IAccount addAccount(User user){
        IAccount bankAccount = new BankAccount(user);
        bankAccount.setIban(ibanCreate());
        this.accounts.add(bankAccount);
        return bankAccount;
    }

    private String ibanCreate()
    {
        String iban;
        iban = ibanId + accountsAmount.toString();
        if(ibanValidate())
        {
            accountsAmount++;
            return iban;
        }
        return null;
    }

    private boolean ibanValidate()
    {
        return true;
        //implement validation
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
