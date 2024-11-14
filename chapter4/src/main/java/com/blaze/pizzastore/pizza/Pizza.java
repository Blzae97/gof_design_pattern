package com.blaze.pizzastore.pizza;

import com.blaze.pizzastore.pizza.ingredient.cheese.Cheese;
import com.blaze.pizzastore.pizza.ingredient.clams.Clams;
import com.blaze.pizzastore.pizza.ingredient.dough.Dough;
import com.blaze.pizzastore.pizza.ingredient.pepperoni.Pepperoni;
import com.blaze.pizzastore.pizza.ingredient.sauce.Sauce;
import com.blaze.pizzastore.pizza.ingredient.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggieList;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    protected abstract void prepare();

    protected void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    protected void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    protected void box() {
        System.out.println("상자에 피자를 담기");
    }

    public String getName() {
        return name;
    }
}
