import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidadeDeElementos = sc.nextInt();
        double mediaDoVetor;
        double somaTotal = 0;
        double[] numeroDoVetor = new double[quantidadeDeElementos];

        for (int i = 0; i < numeroDoVetor.length; i++){
            System.out.print("Digite um numero: ");
            numeroDoVetor[i] = sc.nextDouble();
            somaTotal += numeroDoVetor[i];
        }
        mediaDoVetor = somaTotal / quantidadeDeElementos;
        System.out.printf("Média do vetor: %.3f%n", mediaDoVetor);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(double elementos : numeroDoVetor){
            if(elementos < mediaDoVetor){
                System.out.println(elementos);
            }
        }
    }
}