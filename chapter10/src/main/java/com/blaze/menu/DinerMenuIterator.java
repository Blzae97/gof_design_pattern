package com.blaze.menu;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] menuItemArray;
    private int position = 0;

    public DinerMenuIterator(final MenuItem[] menuItemArray) {
        this.menuItemArray = menuItemArray;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemArray.length && menuItemArray[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItemArray[position];
        position++;

        return menuItem;
    }
}
