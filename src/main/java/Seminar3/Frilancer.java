package Seminar3;

public class Frilancer extends Employee {
    protected double rate;


    public Frilancer(String surName, String name, double salary, int age) {
        super(surName, name, salary,age);
    }

    @Override
    public double calculateSalary() {
        return  20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст: %d; Фриланс; Среднемесечная зарплата (не фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}
