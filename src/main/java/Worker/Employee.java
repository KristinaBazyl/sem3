package Worker;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurName() {return surName;}

    public void setSurName(String surName) {this.surName = surName;}

    public double getSalary() {return salary;}

    public void setSalary(double salary) {this.salary = salary;}

    public Employee(String surName, String name, double salary,int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if(surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

}
