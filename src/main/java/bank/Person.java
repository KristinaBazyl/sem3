package bank;

public class Person implements PersonalDate{
    private final String fio;
    private final String inn;

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return inn;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; ФИО; %s", inn, fio);
    }
}
