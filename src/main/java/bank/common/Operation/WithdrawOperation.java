package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Product.IProduct;

public class WithdrawOperation extends Operation {

    public WithdrawOperation(IAccount source, float amount) throws BankException {
        super(source, null, amount);
        type = OperationType.PAYOFF;
        source.doOperation(this); //call execute method with account context
    }

    public void execute(IProduct product) throws BankException {
        ((IAccount) product).changeBalance(-amount);
    }

}
