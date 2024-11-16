package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Funds Validator app");

        BalanceRepository balanceRepo = new BalanceRepository();

        balanceRepo.setBalance(1000);

        double balance = balanceRepo.getBalance();

        DataProvider provider = new DataProvider();

        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);

        double withdraw = provider.getData();

        DataHandler handler = new DataHandler();

        String result = handler.handleData(withdraw, balance);

        if (result.equals("OK")) {
            balanceRepo.setBalance(balance - withdraw);

            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balanceRepo.getBalance());
        } else {
            System.out.println(handler.handleData(withdraw, balance));
        }



    }

}
