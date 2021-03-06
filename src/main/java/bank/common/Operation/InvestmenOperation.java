package bank.common.Operation;

import bank.common.Bank.IAccount;
import bank.common.Interest.Interest;
import bank.common.Product.Credit;
import bank.common.Product.IProduct;
import bank.common.Product.Investment;

import java.util.Date;

public class InvestmenOperation extends Operation{

    private IProduct investment;

    public InvestmenOperation(IAccount source, float amount, int duration, Interest interest) {
        super(source, null, amount);
        type = OperationType.INVESTMENT_CREATE;
        investment = new Investment(source,duration, interest);
        this.investment.setBalance(amount);
        investment.getOperationHistory().getOperationList().add(this);
        source.doOperation(this);
    }

    public void execute(IProduct product) {
        ((IAccount) product).getInnerProducts().add(investment);
        ((IAccount) product).changeBalance(-amount);
    }


}
