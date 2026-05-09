import bank.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        System.out.print("Is there inicial deposit value (y/n)? ");
        char pass = sc.next().charAt(0);

        Account account;
        if(pass == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            account = new Account(holderName, numberAccount, balance);
        }
        else {
            account = new Account(holderName, numberAccount);
        }
        //Status atualizado da conta
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        //Depositando dinheiro
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);
        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);

        //Sacando Dinheiro
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);
    }
}