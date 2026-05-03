import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        double mediaPonderada = 0, teste1, teste2, teste3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de casos testes: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do seu primmeiro teste: ");
            teste1 = sc.nextDouble();

            System.out.print("Digite a nota do seu segundo teste: ");
            teste2 = sc.nextDouble();

            System.out.print("Digite a nota do seu terceiro teste: ");
            teste3 = sc.nextDouble();

            mediaPonderada = (teste1 * 2 + teste2 * 3 + teste3 * 5) / 10;

            System.out.printf("Sua média é: %.1f%n", mediaPonderada);
        }

        sc.close();
    }
}