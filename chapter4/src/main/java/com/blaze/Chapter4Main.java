package com.blaze;

import com.blaze.pizzastore.pizza.NyStylePizzaStore;
import com.blaze.pizzastore.pizza.Pizza;
import com.blaze.pizzastore.pizza.PizzaStore;

public class Chapter4Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("주문한 피자는 " + nyPizza.getName() + "\n");
    }
}