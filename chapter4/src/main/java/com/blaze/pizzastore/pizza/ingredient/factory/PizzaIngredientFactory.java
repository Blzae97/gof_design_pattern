package com.blaze.pizzastore.pizza.ingredient.factory;

import com.blaze.pizzastore.pizza.ingredient.cheese.Cheese;
import com.blaze.pizzastore.pizza.ingredient.clams.Clams;
import com.blaze.pizzastore.pizza.ingredient.dough.Dough;
import com.blaze.pizzastore.pizza.ingredient.pepperoni.Pepperoni;
import com.blaze.pizzastore.pizza.ingredient.sauce.Sauce;
import com.blaze.pizzastore.pizza.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
