package com.blaze.duck.fly.impl;

import com.blaze.duck.fly.inf.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
