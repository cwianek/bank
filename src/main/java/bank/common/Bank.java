package bank.common;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Account> accountList = new ArrayList<Account>();
    List<Operation> operationList = new ArrayList<Operation>();

    public BankAccount addAccount(User user){
        BankAccount bankAccount = new BankAccount(user);
        this.accountList.add(bankAccount);
        return bankAccount;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }


}
