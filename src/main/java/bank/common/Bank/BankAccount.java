package bank.common.Bank;

import bank.common.BankExceptions.BankException;
import bank.common.Operation.Operation;
import bank.common.Product.IProduct;
import bank.common.Product.Product;
import bank.common.User;

import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Product implements IAccount {
    protected List<IProduct> innerProducts;
    private String iban;

    public BankAccount(User user) {
        super(user);
        innerProducts = new ArrayList<IProduct>();
    }

    public void doOperation(Operation operation) throws BankException {
        operation.execute(this);
        history.add(operation);
        Bank.getBankHistory().add(operation);
    }

    public List<IProduct> getInnerProducts() {
        return innerProducts;
    }


    public boolean setIban(String bankIban) {
        iban = bankIban;
        return true;
    }
}
