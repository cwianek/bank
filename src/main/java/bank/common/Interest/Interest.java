package bank.common.Interest;

import bank.common.BankExceptions.BankException;
import bank.common.Product.IProduct;

public interface Interest {
    public void calculate(IProduct ip) throws BankException;
}
