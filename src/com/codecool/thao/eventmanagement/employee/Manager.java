package com.codecool.thao.eventmanagement.employee;

import com.codecool.thao.eventmanagement.EmployeeCalculator;

public class Manager extends Employee {
    private EmployeeCalculator employeeCalculator;

    public Manager(String name, EmployeeCalculator employeeCalculator) {
        super(name);
        this.employeeCalculator = employeeCalculator;
    }

    public void checkOnHelpers() {
        if (employeeCalculator.getNumOfHelpers() >= 10) {
            System.out.println("Let's go!");
        } else {
            System.out.println("There's not enough helpers!!!");
        }
    }
}
