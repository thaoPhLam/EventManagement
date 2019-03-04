package com.codecool.thao.eventmanagement.employee;

import com.codecool.thao.eventmanagement.BreakTimeActivity;
import com.codecool.thao.eventmanagement.Party;

public class Helper extends Employee {
    private int cocktailMinCount = 0;
    private int weddingMinCount = 0;
    private int informCount = 0;
    private int breakTimeHourCount = 0;
    private BreakTimeActivity breakTimeActivity;
    //private Party party;

    public Helper(String name, BreakTimeActivity breakTimeActivity) {
        super(name);
        this.breakTimeActivity = breakTimeActivity;
    }

    public void workForOneHour(Party party) {
        if (party.equals(Party.COCKTAIL)) {
            offerCocktail();
        } else if (party.equals(Party.WEDDING)) {
            offerCake();
        } else if (party.equals(Party.CONFERENCE)) {
            informGuest();
        }
        haveABreak();
    }

    public void offerCocktail() {
        cocktailMinCount++;
        if (cocktailMinCount == 5) {
            System.out.println(getName() + ": Would you like some COCKTAIL?");
            cocktailMinCount = 0;
        }
    }

    public void offerCake() {
        weddingMinCount++;
        if (weddingMinCount == 10) {
            System.out.println(getName() + ": Have some CAKE?");
            weddingMinCount = 0;
        }
    }

    public void informGuest() {
        informCount++;
        if (informCount == 1) {
            System.out.println(getName() + ": INFORMING GUESTS...");
        }
    }

    public void haveABreak() {
        breakTimeHourCount++;
        if (breakTimeHourCount == 120) {
            if (breakTimeActivity.equals(BreakTimeActivity.COFFEE)) {
                System.out.println(getName() + ": I'm having a " + BreakTimeActivity.COFFEE);
            } else {
                System.out.println(getName() + ": I'm " + BreakTimeActivity.SMOKING);
            }
            breakTimeHourCount = 0;
        }
    }
}
