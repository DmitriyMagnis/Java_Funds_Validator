package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Funds Validator app");

        BalanceRepository balanceRepo = new BalanceRepository();

        balanceRepo.setBalance(1000);

        double balance = balanceRepo.getBalance();

        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);

        double withdraw = getAmount();

        try {
            new AccountValidator().validateAmount(withdraw, balance);

            balanceRepo.setBalance(balance - withdraw);

            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balanceRepo.getBalance());

        } catch (FundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static double getAmount() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
