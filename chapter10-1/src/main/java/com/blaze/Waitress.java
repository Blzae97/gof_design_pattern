package com.blaze;

import com.blaze.menu.MenuComponent;

public class Waitress {
    private MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        allMenu.print();
    }
}
