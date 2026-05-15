import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int numeroDePessoas = sc.nextInt();
        String[] nomes = new String[numeroDePessoas];
        int[] idade = new int[numeroDePessoas];
        String nomeDoMaisVelho;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

        }
        nomeDoMaisVelho = nomes[0];
        for(int i = 0; i < nomes.length; i++){
            if(idade[0] < idade[i])
                nomeDoMaisVelho = nomes[i];
        }
        System.out.println("PESSOA MAIS VELHA: " + nomeDoMaisVelho);
    }
}