package bank.common.Interest;

import bank.common.Product.IProduct;

public class DifferentInterest implements Interest {

    float rate;
    int thresholdLow = 10000;
    int thresholdMed = 15000;
    int thresholdHigh = 20000;
    public DifferentInterest(int rate) {
        this.rate = rate;
    }

    @Override
    public void calculate(IProduct ip) {
        float newRate = rate;
        boolean highestRange = ip.getBalance() > thresholdHigh;
        boolean mediumRange = ip.getBalance() > thresholdLow && ip.getBalance() <= thresholdHigh;
        if(mediumRange ){
            newRate += rate*0.1;
        }
        else if (highestRange){
            newRate += rate*0.2;
        }
        ip.changeBalance(ip.getBalance()*((float) this.rate/100));
    }
}
