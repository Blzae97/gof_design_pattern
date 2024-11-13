package com.blaze.duck.quack.impl;

import com.blaze.duck.quack.inf.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
