package bank.common;

import bank.common.Interest.Interest;
import bank.common.Operation.Operation;

import java.math.BigDecimal;

public interface Account {
    void setInterest(Interest interest);
    Interest getInterest();
    void changeBalance(Operation operation);
    BigDecimal getBalance();
}

