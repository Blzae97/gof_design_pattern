package com.blaze.star.condiment.inf;

import com.blaze.star.coffe.inf.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
