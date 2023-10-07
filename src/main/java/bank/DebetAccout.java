package bank;

public class DebetAccout<T extends PersonalDate> extends Account<T>{
    public DebetAccout(T data, double amount) {
        super(data, amount);
    }
}
