package bank.common.Operation;

import bank.common.Bank.Bank;
import bank.common.Bank.IAccount;
import bank.common.Product.IProduct;

public class ExternalTransfer extends ExternalOperation{
    public ExternalTransfer(Bank bankSource, IAccount source, Bank bankDestination, IAccount destination, float amount)
    {
        super(bankSource, source, bankDestination, destination, amount);
    }

    @Override
    public void execute(IProduct product) {
        if (source.getId() == product.getId()) {
            ((IAccount) product).changeBalance(amount);
        } else {
            ((IAccount) product).changeBalance(-amount);
        }
    }
}
