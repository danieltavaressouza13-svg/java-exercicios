import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.print("What is dollar price? ");
        converter.priceDollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        converter.quantityDollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = R$%.2f%n", converter.transformingCurrency());
        sc.close();
    }
}