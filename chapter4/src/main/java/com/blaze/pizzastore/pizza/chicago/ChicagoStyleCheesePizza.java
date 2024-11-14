package com.blaze.pizzastore.pizza.chicago;

import com.blaze.pizzastore.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    @Override
    protected void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
