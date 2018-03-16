package bank.common;

import java.math.BigDecimal;

public class Investment implements AdditonalProduct{
    private BigDecimal balance;
    private Interest interest;

    public Investment()
    {

    }

    public void changeBalance(Operation operation)
    {

    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public Interest getInterest()
    {
        return interest;
    }

    public void setInterest(Interest interest)
    {

    }
}
