package ru.geekbrains.lesson3;

/**
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    protected Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surName, name, calculateSalary());
    }
}
