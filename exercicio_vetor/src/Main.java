import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de vezes que você quer digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0.0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite uma altura: ");
            vect[i] = sc.nextDouble();
            soma += vect[i] / n;
        }
        System.out.printf("AVERAGE HEIGHT: %.2f%n", soma);
        sc.close();
    }
}