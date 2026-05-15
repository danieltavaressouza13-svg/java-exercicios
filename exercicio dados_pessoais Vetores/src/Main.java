import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadeDePessoas = sc.nextInt();
        double[] altura = new double[quantidadeDePessoas];
        char[] genero = new char[quantidadeDePessoas];
        double alturaMediaDasMulheres;
        double menorAltura, maiorAltura, somaTotalDaAlturaDasMulheres = 0;
        int quantidadeDeMulheres = 0;

        for(int i = 0; i < altura.length; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Gênero da " + (i + 1) + "a pessoa (M ou F): ");
            genero[i] = sc.nextLine().charAt(0);
        }
        menorAltura = altura[0];
        for (double v : altura) {
            if (menorAltura > v) {
                menorAltura = v;
                System.out.printf("Menor altura: %.2f%n", menorAltura);
            }
        }
        maiorAltura = altura[0];
        for (double v : altura) {
            if (maiorAltura < v) {
                maiorAltura = v;
                System.out.printf("Maior altura: %.2f%n", maiorAltura);
            }
        }
        for(int i = 0; i < altura.length; i++){
            if(genero[i] == 'F'){
                quantidadeDeMulheres += 1;
                somaTotalDaAlturaDasMulheres += altura[i];
            }
        }
        alturaMediaDasMulheres = somaTotalDaAlturaDasMulheres / quantidadeDeMulheres;
        System.out.printf("Média das alturas das mulheres = %.2f%n", alturaMediaDasMulheres);
        System.out.println("Numero de homens: " + (quantidadeDePessoas - quantidadeDeMulheres));

        sc.close();
    }
}