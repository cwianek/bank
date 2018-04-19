package bank.common.Product;

import bank.common.Interest.Interest;
import bank.common.Operation.OperationHistory;
import bank.common.User;

public interface IProduct {
    int getId();
    User getOwner();
    Interest getInterest();
    OperationHistory getOperationHistory();
    void changeBalance(float amount);

    void setBalance(float amount);

    float getBalance();
}
