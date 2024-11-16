package app;

import java.util.Scanner;

public class DataProvider {
    public double getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input withdraw: ");
        return scanner.nextDouble();

    }
}
