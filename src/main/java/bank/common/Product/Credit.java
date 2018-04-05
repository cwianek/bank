package bank.common.Product;

import bank.common.Bank.IAccount;
import bank.common.Operation.Operation;
import bank.common.Operation.OperationHistory;
import bank.common.Product.IProduct;
import bank.common.Product.Product;

import java.math.BigDecimal;
import java.util.Date;

public class Credit extends Product implements IProduct {

    int duration;
    boolean closed;

    public Credit(IAccount account, int duration, int rate) {
        super(account.getOwner());
        this.duration = duration;
        this.closed = false;
        this.interest = new Interest(rate);
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
