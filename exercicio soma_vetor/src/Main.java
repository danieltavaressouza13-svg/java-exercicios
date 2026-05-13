
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();
        double media = 0, soma = 0;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um número");
            vect[i] = sc.nextDouble();
            soma += vect[i];
            media = soma / vect.length;
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Valores digitados: %.2f%n", vect[i]);
        }
        System.out.printf("Soma dos valores: %.2f%n", soma);
        System.out.printf("Média dos valores: %.2f%n", media);

        sc.close();
    }
}