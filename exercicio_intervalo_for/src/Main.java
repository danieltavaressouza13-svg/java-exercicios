import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, x, in = 0, out = 0;

        System.out.print("Quantas vezes você quer digitar números? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite:");
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in += 1;
            }
            else
                out += 1;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}