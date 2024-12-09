package com.blaze;

import com.blaze.menu.CafeMenu;
import com.blaze.menu.DinerMenu;
import com.blaze.menu.PanCakeHouseMenu;
import com.blaze.waitress.Waitress;

public class Chapter10Main {
    public static void main(String[] args) {
        PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(panCakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}