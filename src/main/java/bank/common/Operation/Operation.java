package bank.common.Operation;

import bank.common.Product.IProduct;

public abstract class Operation implements IOperation {

    protected float amount;
    protected IProduct source;
    protected IProduct destination;
    protected OperationType type;

    public Operation() {
    }

    public Operation(IProduct source, IProduct destination, float amount) {
        this.source = source;
        this.destination = destination;
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

}
