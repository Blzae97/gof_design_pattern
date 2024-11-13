package com.blaze.duck.fly.impl;

import com.blaze.duck.fly.inf.FlyBehavior;

public class FlyLocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추친으로 날라갑니다.");
    }
}
