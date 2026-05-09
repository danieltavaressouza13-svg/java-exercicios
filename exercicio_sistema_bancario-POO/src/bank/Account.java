package bank;

public class Account {
    //Atributos:
    private String holderName;
    private int numberAccount;
    private double balance;

    //Construtores:
    public Account(String holderName, int numberAccount, double balance) {
        this.holderName = holderName;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }
    public Account(String holderName, int numberAccount) {
        this.holderName = holderName;
        this.numberAccount = numberAccount;
    }
    //Métodos:
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    public void withdraw(double balance){
        this.balance = (this.balance - balance) - 5;
    }

    public String toString(){
        return "Account "
                +numberAccount
                +", Holder: "
                +holderName
                +", Balance: $"
                +String.format("%.2f", balance);
    }

}