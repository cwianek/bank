package bank.common.Operation;

import bank.common.Bank.Bank;
import bank.common.Product.IProduct;

public abstract class ExternalOperation extends Operation {

    private String ibanSource;
    private String ibanDestination;


    public ExternalOperation() {
    }



}
