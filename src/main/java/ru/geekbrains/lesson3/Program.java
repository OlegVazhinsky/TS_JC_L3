package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee hp = new Worker("Potter", "Harry", 44000);

        Employee hg = new Worker("Hermione", "Granger", 84000);

        Employee rw = new Freelancer("Ronald", "Weaseley", 80);

        employees.add(hp);
        employees.add(hg);
        employees.add(rw);

        System.out.println("___________________________________________________");
        System.out.println("Sorted by name:");
        Collections.sort(employees, new EmployeeNameComporator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println("___________________________________________________");
        System.out.println("Sorted by salary:");
        Collections.sort(employees, new EmployeeSalaryComporator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        
    }

}
