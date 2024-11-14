package com.blaze.pizzastore.pizza.ny;

import com.blaze.pizzastore.pizza.Pizza;
import com.blaze.pizzastore.pizza.ingredient.factory.PizzaIngredientFactory;

public class NyStyleCheesePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NyStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("준비 중");
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.cheese = pizzaIngredientFactory.createCheese();
    }
}
