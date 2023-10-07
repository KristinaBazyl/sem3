package Seminar3;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {

    private SortType sortType;

    public AgeComporator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return sortType == SortType.Ascending? Integer.compare(o1.getAge(),o2.getAge()):
                Integer.compare(o2.getAge(),o1.getAge());
    }
}
