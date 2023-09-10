package ru.geekbrains.lesson3;

import java.util.Comparator;

public class EmployeeSalaryComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = 0;
        if ((o1.getSalary() - o2.getSalary()) > 0) res = 1;
        if ((o1.getSalary() - o2.getSalary()) < 0) res = -1;
        return res;
    }
}
