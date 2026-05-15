import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int quantidadeDesejada = sc.nextInt();
        int[] numeros = new int[quantidadeDesejada];
        int quantidadeDePares = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                quantidadeDePares += 1;
            }
        }
        System.out.printf("QUANTIDADE DE PARES = %d%n", quantidadeDePares);
    }
}