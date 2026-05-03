import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadePares;

        double dividendo, divisor, resultadoDivisao;

        System.out.print("Quantas pares de números você quer dividir? ");
        quantidadePares = sc.nextInt();

        for (int i = 0; i < quantidadePares; i++) {
            System.out.print("Dividendo: ");
            dividendo = sc.nextDouble();

            System.out.print("Divisor: ");
            divisor = sc.nextDouble();

            if (divisor == 0){
                System.out.println("Divisão Impossivel!");
            }
            else {
                resultadoDivisao = dividendo / divisor;

                System.out.printf("O resultado é %.2f%n", resultadoDivisao);
            }
        }
        sc.close();
    }
}