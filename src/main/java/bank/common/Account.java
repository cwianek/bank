package bank.common;

import java.math.BigDecimal;

public interface Account {
    void setInterest(Interest interest);
    Interest getInterest();
    void changeBalance(Operation operation);
    BigDecimal getBalance();
}

