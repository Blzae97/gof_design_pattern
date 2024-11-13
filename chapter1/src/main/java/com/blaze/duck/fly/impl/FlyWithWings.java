package com.blaze.duck.fly.impl;

import com.blaze.duck.fly.inf.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
