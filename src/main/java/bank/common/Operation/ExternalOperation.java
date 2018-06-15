package bank.common.Operation;

import bank.common.Bank.Bank;
import bank.common.Bank.IAccount;
import bank.common.Interest.Interest;
import bank.common.Product.Credit;
import bank.common.Product.IProduct;

public abstract class ExternalOperation extends Operation {

    private String ibanSource;
    private String ibanDestination;
    protected IAccount source;
    private IAccount destination;

    public ExternalOperation(Bank bankSource, IAccount source, Bank bankDestination, IAccount destination, float amount) {
        super(source, null, amount);
        ibanSource = bankSource.getIbanId() + source.getId();
        ibanDestination = bankDestination.getIbanId() + destination.getId();
        type = OperationType.TRANSFER;
        this.source = source;
        this.destination = destination;
        source.doOperation(this);
        destination.doOperation(this);
    }

    public void execute(IProduct product) {
        if(product == source) {
            ((IAccount) product).changeBalance(amount);
        }else{
            ((IAccount) product).changeBalance(-amount);
        }
    }

    public IAccount getSource() {
        return source;
    }

    public IAccount getDestination() {
        return destination;
    }

    public String getIbanDestination()
    {
        return ibanDestination;
    }

    public String getIbanSource()
    {
        return ibanSource;
    }
}
