package app;

public class DataHandler {
    public String handleData(double withdraw, double balance) {
        AccountValidator validator = new AccountValidator();
        try {
            return validator.validateAmount(withdraw, balance);
        } catch (FundsException e) {
            return e.getMessage();
        }
    }
}
