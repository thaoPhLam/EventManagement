package com.codecool.thao.eventmanagement.app;

import com.codecool.thao.eventmanagement.BreakTimeActivity;
import com.codecool.thao.eventmanagement.Company;
import com.codecool.thao.eventmanagement.Party;
import com.codecool.thao.eventmanagement.employee.Helper;
import com.codecool.thao.eventmanagement.employee.Manager;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.hireEmployee(new Manager("Thao", company));
        company.hireEmployee(new Helper("Mai", BreakTimeActivity.COFFEE));
        company.hireEmployee(new Helper("Miki", BreakTimeActivity.SMOKING));

        company.organizeParty(Party.WEDDING);
    }
}
