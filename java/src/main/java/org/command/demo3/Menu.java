package org.command.demo3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public List<MenuItem> menuItemList = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }
}
