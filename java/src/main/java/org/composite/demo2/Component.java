package org.composite.demo2;

public interface Component {
    void operation();

    void add(Component component);

    void remove(Component component);
}
