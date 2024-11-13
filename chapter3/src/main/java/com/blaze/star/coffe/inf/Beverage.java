package com.blaze.star.coffe.inf;

import java.math.BigDecimal;

public abstract class Beverage {
    protected String description = "설명 없음";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}
