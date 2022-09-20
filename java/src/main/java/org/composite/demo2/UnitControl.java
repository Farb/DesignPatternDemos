package org.composite.demo2;

public class UnitControl implements Component {
    private String name;

    public UnitControl(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("I am unit control ,name is " + name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }
}
