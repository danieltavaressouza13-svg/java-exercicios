import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int numeroDeAlunos = sc.nextInt();
        double[] primeiraNota = new double[numeroDeAlunos];
        double[] segundaNota = new double[numeroDeAlunos];
        String[] nomeDosAlunos = new String[numeroDeAlunos];
        double[] mediaDasNotas = new double[numeroDeAlunos];


        for(int i = 0; i < primeiraNota.length; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            nomeDosAlunos[i] = sc.nextLine();
            primeiraNota[i] = sc.nextDouble();
            segundaNota[i] = sc.nextDouble();

        }
        System.out.println("ALUNOS APROVADOS:");
        for(int i = 0; i < primeiraNota.length; i++){
            mediaDasNotas[i] = (primeiraNota[i] + segundaNota[i]) / 2;
            if(mediaDasNotas[i] > 6.0){
                System.out.println(nomeDosAlunos[i]);
            }
        }
    }
}