package bank;

public class CreditAccout<T extends PersonalDate> extends Account<T> {
    public CreditAccout(T data, double amount) {
        super(data, amount);
    }
}