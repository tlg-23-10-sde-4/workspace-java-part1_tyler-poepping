package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }


    // Getters and Setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Name=" + getName() +
                "HiredDate=" + getHireDate() +
                "salary=" + salary +
                '}';
    }
}
