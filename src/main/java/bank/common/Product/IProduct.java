package bank.common.Product;

import bank.common.Operation.OperationHistory;
import bank.common.User;

public interface IProduct {
    int getId();
    User getOwner();
    Interest getInterest();
    OperationHistory getOperationHistory();
}
