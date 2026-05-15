import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantidadeValores = sc.nextInt();
        int[] vectorA = new int[quantidadeValores];
        int[] vectorB = new int[quantidadeValores];
        int[] vectorSoma = new int[quantidadeValores];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Digite: ");
            vectorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Digite: ");
            vectorB[i] = sc.nextInt();
        }
        System.out.println("Vetor Resultante:");
        for(int i = 0; i < vectorA.length; i++){
            vectorSoma[i] = vectorA[i] + vectorB[i];
            System.out.println("Resultado:");
            System.out.println(vectorSoma[i]);
        }
    }
}