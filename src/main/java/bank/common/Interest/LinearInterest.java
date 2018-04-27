package bank.common.Interest;

import bank.common.BankExceptions.BankException;
import bank.common.Product.IProduct;
import bank.common.Product.Product;

public class LinearInterest implements Interest {

    int rate;

    public LinearInterest(int rate) {
        this.rate = rate;
    }

    @Override
    public void calculate(IProduct ip) throws BankException {
        ip.changeBalance(ip.getBalance()*((float) this.rate/100));
    }
}
