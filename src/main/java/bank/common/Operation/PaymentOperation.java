package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.Product.IProduct;

public class PaymentOperation extends Operation {

    public PaymentOperation(IAccount product, float amount) {
        super(null, product, amount);
        type = OperationType.PAYMENT;
        product.doOperation(this);
    }

    public void execute(IProduct product) {
        ((IAccount )product).changeBalance(amount);
    }
}
