package homeworke;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getBoxWeight(){
        float massa =0;
        for(T fruit: fruits){
            massa += fruit.getWeight();
        }
        return massa;
    }

    public boolean compare(Box box){
        return this.getBoxWeight()==box.getBoxWeight();
    }

    public void move(Box<T> box){
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
