package homeworke;

public class Orange extends Fruit{

    private String name = "orange";
    public Orange() {
        super(1.5f);
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
