package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.BankExceptions.BankException;
import bank.common.Interest.Interest;
import bank.common.Product.Credit;
import bank.common.Product.IProduct;

import java.util.Date;

public class CreditOperation extends Operation{

    private Credit credit;

    public CreditOperation(IAccount source, float amount, int duration, Interest interest) throws BankException {
        super(source, null, amount);
        type = OperationType.CREDIT_CREATE;
        this.credit = new Credit(source,duration, interest);
        this.credit.setBalance(amount);
        this.credit.getOperationHistory().getOperationList().add(this);
        source.doOperation(this);
    }

    public void execute(IProduct product) throws BankException {
        ((IAccount) product).getInnerProducts().add(credit);
        ((IAccount) product).changeBalance(amount);
    }


}
