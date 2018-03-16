package bank.common;

import java.math.BigDecimal;

public class Operation {

    private OperationType type;
    private BigDecimal amount;
    private Object source;
    private Object destination;

    public Operation(Object source, Object destination, BigDecimal amount, OperationType type) {
        this.source = source;
        this.destination = destination;
        this.amount = amount;
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
