package com.blaze.menu;

public class DinerMenu implements Menu{
    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItemArray;

    public DinerMenu() {
        menuItemArray = new MenuItem[MAX_ITEMS];
        addMenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        addMenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        addMenuItem("오늘의 스프 y", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        addMenuItem("핫도그", "샤워크라우트, 갖은 양념, 양파, 치즈가 곁을어진 핫도그", false, 3.05);

    }

    private void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItemArray[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Deprecated
    public MenuItem[] getMenuItemArray() {
        return menuItemArray;
    }

    @Override
    public DinerMenuIterator createIterator() {
        return new DinerMenuIterator(menuItemArray);
    }
}
