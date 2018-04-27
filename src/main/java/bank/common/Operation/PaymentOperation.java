package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Product.IProduct;

public class PaymentOperation extends Operation {

    public PaymentOperation(IAccount product, float amount) {
        super(null, product, amount);
        type = OperationType.PAYMENT;
        try {
            product.doOperation(this);
        } catch (BankException e) {
            e.printStackTrace();
        }
    }

    public void execute(IProduct product) throws BankException {
        ((IAccount )product).changeBalance(amount);
    }
}
