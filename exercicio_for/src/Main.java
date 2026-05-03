import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.print(Math.pow(i, 2) + " ");
            System.out.println(Math.pow(i, 3));
        }
    }
}