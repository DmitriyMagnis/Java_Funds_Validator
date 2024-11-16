package app;

public class AccountValidator {
    public void validateAmount(double withdrawal, double balance) {
        if (withdrawal > balance) {
            throw new FundsException("Insufficient funds!");
        }
    }
}
