import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gasolina = 0, disel = 0, alcool = 0, escolhaCliente;
        System.out.print("Qual produto você prefere? Digite 1 -> Alcool. 2 -> Gasolina. 3 -> Disel. 4-> Fim. R: ");
        escolhaCliente = sc.nextInt();
        while (escolhaCliente != 4){
            if (escolhaCliente == 1){
                alcool += 1;
            }
            else if (escolhaCliente == 2) {
                gasolina += 1;
            }
            else if (escolhaCliente == 3) {
                disel += 1;
            }
            System.out.print("Qual produto você prefere? Digite 1 -> Alcool. 2 -> Gasolina. 3 -> Disel. 4-> Fim. R: ");
            escolhaCliente = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);

        sc.close();
    }
}