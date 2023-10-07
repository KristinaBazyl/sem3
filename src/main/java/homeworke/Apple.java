package homeworke;



public class Apple extends Fruit{

    private String name = "apple";
    public Apple() {
        super(1f);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
