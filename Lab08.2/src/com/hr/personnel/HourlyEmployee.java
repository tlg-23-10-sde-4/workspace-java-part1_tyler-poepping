package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    double rate;
    double hours;

    //CTORs
    public HourlyEmployee() {}

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // Getters and Setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "Name=" + getName() +
                "HiredDate=" + getHireDate() +
                "rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
