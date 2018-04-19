package bank.common.Product;

import bank.common.Interest.Interest;
import bank.common.Operation.OperationHistory;
import bank.common.User;
import bank.common.Utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Product implements IProduct {
    protected int id;
    protected Date creationDate;
    protected float balance;
    protected Interest interest;
    protected OperationHistory history;
    protected User owner;
    protected List<Product> innerProducts;

    public Product(User user) {
        this.owner = user;
        this.creationDate = new Date();
        this.balance = 0;
        this.history = new OperationHistory();
        this.id = Utils.getUniqueId();
        this.innerProducts = new ArrayList<>();
    }
    public void setBalance(float amount) {
        this.balance = amount;
    }

    public float getBalance() {
        return balance;
    }


    public void changeBalance(float amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public Interest getInterest() {
        return interest;
    }

    public OperationHistory getOperationHistory() {
        return history;
    }
}
