package Seminar4;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Employee employee = new Employee("AAA", 33);
        ArrayList<Employee> arrayList1 = new ArrayList<>();
//        arrayList1.add(12);
        arrayList1.add(employee);
        arrayList1.add(employee);
        arrayList1.add(employee);
        arrayList1.add(employee);

        for (Employee o: arrayList1){
            System.out.println(o.getName());

        }


        MyArraylist<Employee> myArraylist = new MyArraylist<>(new Employee[10]);
        myArraylist.add(employee);
        myArraylist.add(employee);
        myArraylist.add(employee);
        System.out.println("общее кол-во элементов:"+ myArraylist.size());


    }
}
