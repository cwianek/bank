package bank.common.Product;

import bank.common.Bank.IAccount;
import bank.common.Interest.Interest;

public class Credit extends Product implements IProduct {

    int duration;
    boolean closed;

    public Credit(IAccount account, int duration, Interest interest) {
        super(account.getOwner());
        this.duration = duration;
        this.closed = false;
        this.interest = interest;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
