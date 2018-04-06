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
        boolean LowestRange = ip.getBalance() <= thresholdLow;
        boolean MediumRange = ip.getBalance() > thresholdLow && ip.getBalance() <= thresholdHigh;
        if( ){//TODO:LOL Zrobić coś bo tak

        }
        ip.changeBalance(ip.getBalance()*((float) this.rate/100));
    }
}
