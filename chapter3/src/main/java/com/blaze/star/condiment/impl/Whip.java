package com.blaze.star.condiment.impl;

import com.blaze.star.coffe.inf.Beverage;
import com.blaze.star.condiment.inf.CondimentDecorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.description = "휘핑";
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal(100));
    }
}
