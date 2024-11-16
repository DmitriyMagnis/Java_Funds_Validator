package app;

public class AccountValidator {
    public String validateAmount(double withdrawal, double balance) {
        if (withdrawal > balance) {
            throw new FundsException("Insufficient funds!");
        }
        return "OK";
    }
}
