import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Quais são as coordenadas de x: ");
        x = sc.nextInt();
        System.out.print("Quais são as coordenadas de y: ");
        y = sc.nextInt();
        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro Quadrante");
            }
            else if (x < 0 && y > 0){
                System.out.println("Segundo Quadrante");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro Quadrante");
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto Quadrante");
            }
            System.out.print("Quais são as coordenadas de x: ");
            x = sc.nextInt();
            System.out.print("Quais são as coordenadas de y: ");
            y = sc.nextInt();
        }
        sc.close();
    }
}