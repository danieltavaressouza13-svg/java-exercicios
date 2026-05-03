import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um número inteiro de 1 a 1000 e veja os números impares de 1 ao valor digitado. R: ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i = i + 2) {
            System.out.println(i);
        }
        
        sc.close();
    }
}