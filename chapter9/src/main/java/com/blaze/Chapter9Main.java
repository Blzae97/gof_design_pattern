package com.blaze;

public class Chapter9Main {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        beverage.prepareRecipe();

        System.out.println();

        beverage = new Tea();
        beverage.prepareRecipe();
    }
}