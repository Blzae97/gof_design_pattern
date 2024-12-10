package com.blaze;

import com.blaze.gumball.GumballMachine;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("\n" + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();


        System.out.println("\n" + gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("\n" + gumballMachine);
    }
}