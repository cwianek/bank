package bank.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Account> accountList = new ArrayList<Account>();
    List<Operation> operationList = new ArrayList<Operation>();

    public Account addAccount(User user){
        Account bankAccount = new BankAccount(user);
        this.accountList.add(bankAccount);
        return bankAccount;
    }
//TODO: posprzatac
    public void makeOperation(Account source, Account destination, BigDecimal amount){
        Operation operationForSource = new Operation(source, destination, amount, OperationType.PAYMENT);
        Operation operationForDestination = new Operation(source, destination, amount, OperationType.PAYOFF);
        source.changeBalance(operationForSource);
        destination.changeBalance(operationForDestination);
        operationList.add(operationForSource);
        operationList.add(operationForDestination);
    }

    public void makeOperation(String source, Account destination, BigDecimal amount){
        Operation operationForDestination = new Operation(source, destination, amount, OperationType.PAYMENT);
        destination.changeBalance(operationForDestination);
        operationList.add(operationForDestination);
    }

    public void makeOperation(Account source, String destination, BigDecimal amount){
        Operation operationForSource = new Operation(source, destination, amount, OperationType.PAYOFF);
        source.changeBalance(operationForSource);
        operationList.add(operationForSource);
    }


    public List<Account> getAccountList() {
        return accountList;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }


}
