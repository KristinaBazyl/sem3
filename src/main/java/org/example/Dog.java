package org.example;

public class Dog extends Animal{

    public static int counter;

    {
        counter++;
    }

    protected static int getCounter(){
        return counter;
    }

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

}
