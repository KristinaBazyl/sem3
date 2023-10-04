package Worker;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    static Random random = new Random();

    static Worker generateWorker() {
        String[] names = new String[]{"Крис", "Ира", "Коля"};
        String[] surnames = new String[]{"Логинова", "Петров", "Филонова"};

        int salary = random.nextInt(50000, 110000);
        int age = random.nextInt(20, 50);

        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary,age);
        return worker;

    }

    static Frilancer generateFrilancer() {
        String[] names = new String[]{"Аня", "Крис", "Артем", "Жавохир", "Петр", "Вика"};
        String[] surnames = new String[]{"Ивонов", "Соловьева", "Базыль", "Кудрова", "Логинов", "Васильева"};

        int salary = random.nextInt(1000, 3000);
        int age = random.nextInt(20, 50);
        Frilancer frilancer = new Frilancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return frilancer;
    }

    static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            int choice = random.nextInt(2);
            if (choice == 0) {
                employees[i] = generateFrilancer();

            } else {
                employees[i] = generateWorker();
            }
        }
        return employees;
    }
        public static void main(String[] args) {
            Employee[] emplooyees = generateEmployees(15);

//            Arrays.sort(emplooyees, new SalaryComparator(SortType.Ascending));
//
//            for (Employee emplooyee : emplooyees) {
//                System.out.println(emplooyee);
//            }
//
//            System.out.println();
//
//            Arrays.sort(emplooyees, new SalaryComparator(SortType.Descending));
//
//            for (Employee emplooyee : emplooyees) {
//                System.out.println(emplooyee);
//            }
//
//            System.out.println();

            Arrays.sort(emplooyees, new AgeComporator(SortType.Ascending));

            for (Employee emplooyee : emplooyees) {
                System.out.println(emplooyee);
            }

            System.out.println();

            Arrays.sort(emplooyees, new AgeComporator(SortType.Descending));

            for (Employee emplooyee : emplooyees) {
                System.out.println(emplooyee);
            }

        }
    }







