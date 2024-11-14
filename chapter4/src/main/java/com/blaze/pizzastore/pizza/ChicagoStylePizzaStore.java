package com.blaze.pizzastore.pizza;

import com.blaze.pizzastore.pizza.chicago.ChicagoStyleCheesePizza;
import com.blaze.pizzastore.pizza.chicago.ChicagoStyleClamPizza;
import com.blaze.pizzastore.pizza.chicago.ChicagoStylePepperoniPizza;
import com.blaze.pizzastore.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }

        if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }

        if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }

        return null;
    }
}
