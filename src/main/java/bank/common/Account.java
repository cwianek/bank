package bank.common;

import java.math.BigDecimal;

public interface Account {
    void changeBalance(Operation operation);
    BigDecimal getBalance();
    Interest getInterest();
    void setInterest(Interest interest);
}
