import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] elemento = new double[n];
        double mediaDosPares, somatotalPares = 0, quantidadePares = 0;

        for(int i = 0; i < elemento.length; i++) {
            System.out.print("Digite um numero: ");
            elemento[i] = sc.nextDouble();
            if(elemento[i] % 2 == 0){
                somatotalPares += elemento[i];
                quantidadePares += 1;
            }
        }
        mediaDosPares = somatotalPares / quantidadePares;
        if(mediaDosPares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            System.out.printf("Média dos pares: %.2f%n", mediaDosPares);
        }
    }
}