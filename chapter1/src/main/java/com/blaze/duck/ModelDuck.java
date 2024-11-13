package com.blaze.duck;

import com.blaze.duck.fly.impl.FlyNoWay;
import com.blaze.duck.quack.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("보여진다!!!");
    }
}
