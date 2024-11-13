package com.blaze;

import com.blaze.duck.Duck;
import com.blaze.duck.MallardDuck;
import com.blaze.duck.ModelDuck;
import com.blaze.duck.fly.impl.FlyLocketPowered;

public class Chapter1Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyLocketPowered());
        modelDuck.performFly();
    }
}