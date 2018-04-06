package bank.common.Bank;

import bank.common.Operation.Operation;
import bank.common.Product.IProduct;
import bank.common.Product.Product;
import bank.common.User;

import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Product implements IAccount {
    protected List<IProduct> innerProducts;

    public BankAccount(User user) {
        super(user);
        innerProducts = new ArrayList<IProduct>();
    }




    public void doOperation(Operation operation) {
        operation.execute(this);
        history.add(operation);
        Bank.getBankHistory().add(operation);
    }

    public List<IProduct> getInnerProducts() {
        return innerProducts;
    }
}
