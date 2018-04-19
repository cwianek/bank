package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.Product.IProduct;


public class TransferOperation extends Operation {

    //transfer from bank account to bank account
    public TransferOperation(IAccount source, IAccount destination, float amount) {
        super(source, destination, amount);
        type = OperationType.TRANSFER;
        source.doOperation(this); //call execute method with account context
        destination.doOperation(this); //the same as above
    }

    public void execute(IProduct product) {
        if (source.getId() == product.getId()) {
            ((IAccount) product).changeBalance(amount);
        } else {
            ((IAccount) product).changeBalance(-amount);
        }
    }
}
