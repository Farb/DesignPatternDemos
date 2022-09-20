package org.composite.demo2;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component {
    private String name;
    private List<Component> componentList = new ArrayList<>();

    public Container(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("I am a container,name is " + name);
        if (!componentList.isEmpty()) {
            System.out.println("My children are:");
        }
        for (Component component : componentList) {
            component.operation();
        }
        System.out.println("---------");
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }
}
