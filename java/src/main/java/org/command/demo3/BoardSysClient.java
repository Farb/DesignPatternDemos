package org.command.demo3;

public class BoardSysClient {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem();
        item1.setCommand(new OpenCommand());
        menu.addMenuItem(item1);
        MenuItem item2 = new MenuItem();
        item2.setCommand(new CreateCommand());
        menu.addMenuItem(item2);
        MenuItem item3 = new MenuItem();
        item3.setCommand(new EditCommand());
        menu.addMenuItem(item3);

        for (MenuItem menuItem : menu.menuItemList) {
            menuItem.click();
        }
    }
}
