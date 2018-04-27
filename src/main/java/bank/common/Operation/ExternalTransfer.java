package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Product.IProduct;

public class ExternalTransfer extends ExternalOperation{
    @Override
    public void execute(IProduct product) throws BankException {
        if (source.getId() == product.getId()) {
            ((IAccount) product).changeBalance(amount);
        } else {
            ((IAccount) product).changeBalance(-amount);
        }
    }
}
