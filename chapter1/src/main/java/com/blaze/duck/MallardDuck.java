package com.blaze.duck;

import com.blaze.duck.fly.impl.FlyWithWings;
import com.blaze.duck.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("보인다!");
    }
}
