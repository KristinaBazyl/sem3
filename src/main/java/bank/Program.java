package bank;

public class Program {
    public static void main(String[] args) {
        Entity entity= new Entity("ООО Рога и копыты","1999999");
        Person person = new Person("AAA BBB CCC", "67876788");


        DebetAccout<Entity> debetAccout1= new DebetAccout<>(entity, 1500000);
        CreditAccout<Person> creditAccout1 = new CreditAccout<>(person, 300);


        Transaction<Account> transaction1 = new Transaction<>(debetAccout1, creditAccout1, 10000);
        transaction1.execute();


        transaction1.execute();



    }
}
