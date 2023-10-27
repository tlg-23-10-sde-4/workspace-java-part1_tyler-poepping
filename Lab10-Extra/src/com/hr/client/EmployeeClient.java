package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) throws DestinationUnreachableException {
        Employee emp = new Employee("Jim");
        try {
        emp.goToWork();
        } catch (DestinationUnreachableException e) {
            throw new DestinationUnreachableException(e);
        }
    }
}