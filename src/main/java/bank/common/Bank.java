package bank.common;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<BankAccount> bankAccountList = new ArrayList<BankAccount>();
    List<Operation> operationList = new ArrayList<Operation>();

    public BankAccount addAccount(User user){
        BankAccount bankAccount = new BankAccount(user);
        this.bankAccountList.add(bankAccount);
        return bankAccount;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }


}
