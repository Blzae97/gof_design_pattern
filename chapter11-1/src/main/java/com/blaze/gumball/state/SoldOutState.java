package com.blaze.gumball.state;

import com.blaze.gumball.GumballMachine;

public class SoldOutState implements State {

    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진되었습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진되었습니다.");
    }
}
