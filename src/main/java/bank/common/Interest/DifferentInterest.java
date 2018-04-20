package bank.common.Interest;

import bank.common.Product.IProduct;

public class DifferentInterest implements Interest {

    int rate;
    int thresholdLow = 10000;
    int thresholdMed = 15000;
    int thresholdHigh = 20000;
    public DifferentInterest(int rate) {
        this.rate = rate;
    }

    @Override
    public void calculate(IProduct ip) {
        boolean mediumRange = ip.getBalance() > thresholdLow && ip.getBalance() <= thresholdHigh;
        boolean highRange = ip.getBalance() > thresholdHigh;
        if( mediumRange ){
            rate += 0.1*rate;
        }
        else if(highRange) {
            rate+= 0.2*rate;
        }
        ip.changeBalance(ip.getBalance()*((float) this.rate/100));
    }
}
