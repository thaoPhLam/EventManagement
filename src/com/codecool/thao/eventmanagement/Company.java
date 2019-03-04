package com.codecool.thao.eventmanagement;

import com.codecool.thao.eventmanagement.employee.Employee;
import com.codecool.thao.eventmanagement.employee.Helper;
import com.codecool.thao.eventmanagement.employee.Manager;

import java.util.ArrayList;
import java.util.List;

public class Company implements EmployeeCalculator {
    private List<Employee> employees = new ArrayList<>();
    private List<Manager> managers = new ArrayList<>();
    private List<Helper> helpers = new ArrayList<>();

    public void hireEmployee(Employee employee) {
        if (employee instanceof Manager) {
            managers.add((Manager) employee);
        } else if (employee instanceof Helper) {
            helpers.add((Helper) employee);
        }
        employees.add(employee);
    }

    public void organizeParty(Party party) {
        if (helpers.size() >= 10 && managers.size() >= 3) {
            if (party.equals(Party.COCKTAIL)) {
                organizeCocktailParty(party, 5); //2x kellene szünetet tartania
            } else if (party.equals(Party.WEDDING)) {
                organizeWedding(party, 8); //4x kellene szünetet tartania
            } else if (party.equals(Party.CONFERENCE)) {
                organizeConference(party, 10); //5x kellene szünetet tartania
            }
        } else {
            System.out.println("Not enough helpers..");
        }
    }

    private void organizeCocktailParty(Party party, int hour) {
        for (int i = 0; i < hour * 60; i++) {
            for (Helper helper : helpers) {
                helper.workForOneHour(party);
            }
        }
    }

    private void organizeWedding(Party party, int hour) {
        for (int i = 0; i < hour * 60; i++) {
            for (Helper helper : helpers) {
                helper.workForOneHour(party);
            }
        }
    }

    private void organizeConference(Party party, int hour) {
        for (int i = 0; i < hour * 60; i++) {
            for (Helper helper : helpers) {
                helper.workForOneHour(party);
            }
        }
    }

    @Override
    public int getNumOfHelpers() {
        return helpers.size();
    }
}
