package bank.common;

import java.math.BigDecimal;

public class Operation {

    private OperationType type;
    private BigDecimal amount;

    public Operation(BigDecimal amount, OperationType type) {
        this.amount = amount;
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
