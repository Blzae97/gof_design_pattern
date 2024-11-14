package com.blaze.pizzastore.pizza;

import com.blaze.pizzastore.pizza.ingredient.factory.NyPizzaIngredientFactory;
import com.blaze.pizzastore.pizza.ingredient.factory.PizzaIngredientFactory;
import com.blaze.pizzastore.pizza.ny.NyStyleCheesePizza;
import com.blaze.pizzastore.pizza.ny.NyStyleClamPizza;
import com.blaze.pizzastore.pizza.ny.NyStylePepperoniPizza;
import com.blaze.pizzastore.pizza.ny.NyStyleVeggiePizza;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new NyStyleCheesePizza(pizzaIngredientFactory);
            pizza.name = "뉴욕 스타일 치즈 피자";
        }

        if (type.equals("pepperoni")) {
            pizza = new NyStylePepperoniPizza();
            pizza.name = "뉴욕 스타일 페퍼로니 피자";
        }

        if (type.equals("clam")) {
            pizza = new NyStyleClamPizza();
            pizza.name = "뉴욕 스타일 조개 피자";
        }

        if (type.equals("veggie")) {
            pizza = new NyStyleVeggiePizza();
            pizza.name = "뉴욕 스타일 야채 피자";
        }

        return pizza;
    }
}
