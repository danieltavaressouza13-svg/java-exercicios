import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double C, F;
        char resposta;

        do {
            System.out.print("Digite a temperatura em Celcius: ");
            C = sc.nextDouble();
            F = 9 * C / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir o programa (s/n) R: ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

    }
}