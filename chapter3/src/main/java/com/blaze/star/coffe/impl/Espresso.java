package com.blaze.star.coffe.impl;

import com.blaze.star.coffe.inf.Beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "에스프레소";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(20000);
    }
}
