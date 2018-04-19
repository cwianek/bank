package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.Product.IProduct;

public class WithdrawOperation extends Operation {

    public WithdrawOperation(IAccount source, float amount) {
        super(source, null, amount);
        type = OperationType.PAYOFF;
        source.doOperation(this); //call execute method with account context
    }

    public void execute(IProduct product) {
        ((IAccount) product).changeBalance(-amount);
    }

}
