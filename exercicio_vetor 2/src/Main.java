import entites.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos você vai adicionar: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double soma = 0.0;


        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite o nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            soma += vect[i].getPrice() / vect.length;
        }
        System.out.printf("Avarage Price: %.2f%n", soma);

        sc.close();
    }
}