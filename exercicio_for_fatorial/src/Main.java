import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, fatorial = 1;

        System.out.print("Digite um número e veja seu fatorial. R: ");
        n = sc.nextInt();

        if (n == 0) {
            System.out.println("O resultado é 1");
        }
        else {
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;
            }
        }
        System.out.println("O resultado é "+ fatorial);
    }
}