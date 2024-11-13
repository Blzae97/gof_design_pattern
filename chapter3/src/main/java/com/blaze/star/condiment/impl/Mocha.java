package com.blaze.star.condiment.impl;

import com.blaze.star.coffe.inf.Beverage;
import com.blaze.star.condiment.inf.CondimentDecorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.description = "모카";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal(200));
    }
}
