package util;

public class CurrencyConverter {
    public double quantityDollar;
    public double priceDollar;

    public final static double IOF = 0.06;

    public double transformingCurrency(){
       return (quantityDollar + (quantityDollar * IOF)) * priceDollar;
    }
}
