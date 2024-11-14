package com.blaze.pizzastore.pizza.ingredient.factory;

import com.blaze.pizzastore.pizza.ingredient.cheese.Cheese;
import com.blaze.pizzastore.pizza.ingredient.cheese.ReggianoCheese;
import com.blaze.pizzastore.pizza.ingredient.clams.Clams;
import com.blaze.pizzastore.pizza.ingredient.clams.FreshClams;
import com.blaze.pizzastore.pizza.ingredient.dough.Dough;
import com.blaze.pizzastore.pizza.ingredient.dough.ThinCrustDough;
import com.blaze.pizzastore.pizza.ingredient.pepperoni.Pepperoni;
import com.blaze.pizzastore.pizza.ingredient.pepperoni.SlicedPepperoni;
import com.blaze.pizzastore.pizza.ingredient.sauce.MarinaraSauce;
import com.blaze.pizzastore.pizza.ingredient.sauce.Sauce;
import com.blaze.pizzastore.pizza.ingredient.veggies.*;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
