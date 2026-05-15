import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vão ser digitadas? ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        int[] idade = new int[n];
        String[] nome = new String[n];
        double somaDasAlturas = 0, mediaDasAlturas;
        double menoresDe16 = 0.0;

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Dados da " + (1 + i) + "a pessoa:" );
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            somaDasAlturas += altura[i];
        }

        mediaDasAlturas = somaDasAlturas / altura.length;

        for(int i = 0; i < altura.length; i++){
            if (idade[i] < 16){
                menoresDe16 += 1;
            }
        }
        System.out.printf("Altura média: %.2f%n", mediaDasAlturas);
        System.out.println("Pessoas com menos de 16 anos: " + (menoresDe16 * 100) / n  + "%");
        for(int i = 0; i < altura.length; i++){
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}