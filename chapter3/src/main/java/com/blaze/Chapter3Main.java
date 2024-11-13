package com.blaze;

import com.blaze.star.coffe.impl.Espresso;
import com.blaze.star.coffe.inf.Beverage;
import com.blaze.star.condiment.impl.Mocha;
import com.blaze.star.condiment.impl.Whip;

public class Chapter3Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "는 " + espresso.cost() + "원 입니다.");

        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);

        System.out.println(espresso.getDescription() + "는 " + espresso.cost() + "원 입니다.");
    }
}