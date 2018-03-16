package bank.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount implements Account {

    private int id;
    private int ownerId;
    private Date creationDate;
    private BigDecimal balance ;
    private List<Operation> operationList = new ArrayList<Operation>();
    private Interest interest;
    private List<AdditonalProduct> additonalProducts = new ArrayList<AdditonalProduct>();


    public BankAccount(User user) {
        this.balance = new BigDecimal(0);
        this.id = user.getId();
        this.ownerId = user.getId();
        this.creationDate = new Date();
    }


    public void changeBalance(Operation operation){
        this.balance = this.balance.add(operation.getAmount());
    }

    public BigDecimal getBalance() {
        return balance;
    }


    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    public void addAdditonalProduct(AdditonalProduct additonalProduct)
    {
        additonalProducts.add(additonalProduct);
    }
}
