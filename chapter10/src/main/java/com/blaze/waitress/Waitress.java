package com.blaze.waitress;


import com.blaze.menu.Menu;
import com.blaze.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    private final Menu panCakeHouseMenu;
    private final Menu dinerMenu;
    private final Menu cafeMenu;

    public Waitress(Menu panCakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> panCakeHouseMenuIterator = panCakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuiterator = cafeMenu.createIterator();

        System.out.println("메뉴\n----\n아침 메뉴");
        printMenu(panCakeHouseMenuIterator);
        System.out.println("\n점심 메뉴");
        printMenu(dinerMenuIterator);
        System.out.println("\n저녁 메뉴");
        printMenu(cafeMenuiterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + "$ ");
            System.out.println(" -" + menuItem.getDescription());
        }
    }


}
