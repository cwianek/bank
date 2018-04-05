package bank.common.Bank;
import bank.common.Operation.Operation;
import bank.common.Product.IProduct;
import bank.common.Product.Product;

import java.util.List;

public interface IAccount extends IProduct {
    void doOperation(Operation operation);

    void changeBalance(float amount);

    void setBalance(float amount);

    float getBalance();

    public List<IProduct> getInnerProducts();
}
