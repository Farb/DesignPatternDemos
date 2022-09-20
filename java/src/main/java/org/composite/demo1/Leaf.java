package org.composite.demo1;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void issue(String officialDocument) {
        System.out.println("I'm " + name + ",I received the official document:" + officialDocument);
        System.out.println("I am leaf node,I cannot issue the official document.");
    }

    @Override
    public void add(Component component) {
        System.out.println("No authority");
    }

    @Override
    public void remove(Component component) {
        System.out.println("No authority");
    }

    @Override
    public Component get(int i) {
        System.out.println("No authority");
        return null;
    }
}
