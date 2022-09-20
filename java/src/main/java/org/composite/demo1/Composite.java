package org.composite.demo1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    private List<Component> components = new ArrayList<>();

    @Override
    public void issue(String officialDocument) {
        System.out.println("I'm " + name + ",I received the official document:" + officialDocument);
        for (Component component : components) {
            component.issue(officialDocument);
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component get(int i) {
        return components.get(i);
    }
}
