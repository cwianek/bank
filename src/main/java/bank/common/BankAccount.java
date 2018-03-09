package bank.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private int id;
    private int ownerId;
    private Date creationDate;
    private BigDecimal balance ;
    private List<Operation> operationList = new ArrayList<Operation>();

    public BankAccount(User user) {
        this.balance = new BigDecimal(0);
        this.id = user.getId();
        this.ownerId = user.getId();
        this.creationDate = new Date();
    }

    public void changeBalance(Operation operation){
        BigDecimal am = operation.getAmount();
        this.balance = this.balance.add(operation.getAmount());

    }

    public BigDecimal getBalance() {
        return balance;
    }
}