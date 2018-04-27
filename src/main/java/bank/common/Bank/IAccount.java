package bank.common.Bank;
import bank.common.BankExceptions.BankException;
import bank.common.Operation.Operation;
import bank.common.Product.IProduct;
import bank.common.Product.Product;

import java.util.List;

public interface IAccount extends IProduct {
    void doOperation(Operation operation) throws BankException;

    List<IProduct> getInnerProducts();

    boolean setIban(String bankIban);
}
