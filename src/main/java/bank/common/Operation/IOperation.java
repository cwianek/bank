package bank.common.Operation;

import bank.common.BankExceptions.BankException;
import bank.common.Product.IProduct;

public interface IOperation {
    void execute(IProduct product) throws BankException;
}
