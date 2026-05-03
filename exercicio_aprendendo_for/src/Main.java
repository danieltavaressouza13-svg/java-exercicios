import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, soma = 0;

        System.out.print("Digite quantas vezes você quer digitar números e ver a sua soma: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("O total da sua soma é: " + soma);
        sc.close();
    }
}