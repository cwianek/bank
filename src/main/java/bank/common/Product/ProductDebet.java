package bank.common.Product;

import bank.common.BankExceptions.BankException;
import bank.common.Interest.Interest;
import bank.common.Operation.OperationHistory;
import bank.common.User;

public class ProductDebet implements IProduct{

    private IProduct product;
    private float debet;
    private float debetLimit;

    public ProductDebet(IProduct product, float debetLimit) {
        this.product = product;
        this.debet = 0;
        this.debetLimit = debetLimit;
    }

    public float getDebet() {
        return debet;
    }

    @Override
    public int getId() {
        return product.getId();
    }

    @Override
    public User getOwner() {
        return product.getOwner();
    }

    @Override
    public Interest getInterest() {
        return product.getInterest();
    }

    @Override
    public OperationHistory getOperationHistory() {
        return product.getOperationHistory();
    }

    @Override
    public void changeBalance(float amount) throws BankException {
        if(amount>=0) {
            income(amount);
        }
        else {
            outcome(amount);
        }
    }

    private void outcome(float amount) throws BankException {
        float changeAmount = -amount;
        if(product.getBalance()>changeAmount){
            product.changeBalance(amount);
        }
        else {
            float maxAmountAvailable = product.getBalance()+ debetLimit;
            if(maxAmountAvailable > changeAmount)
            {
                changeAmount-=product.getBalance();
                product.changeBalance(-product.getBalance());
                debet += changeAmount;
            }
            else {
                throw new BankException("Nie masz hajsu biedaku... a mogles zostac programista");
            }
        }
    }

    private void income(float amount) throws BankException {
        if(debet>0) {
            if(debet>amount){
                debet -= amount;
            }
            else {
                amount-=debet;
                debet = 0;
                product.changeBalance(amount);
            }
        }
        else {
            product.changeBalance(amount);
        }
    }

    @Override
    public void setBalance(float amount) {
        product.setBalance(amount);
    }

    @Override
    public float getBalance() {
        return 0;
    }
}
