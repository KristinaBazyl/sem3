package homeworke;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println(appleBox.getBoxWeight());


        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getBoxWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());




        System.out.println(appleBox.compare(orangeBox));

        orangeBox.move(orangeBox1);

        System.out.println(orangeBox);
        System.out.println(orangeBox1);





    }
}
