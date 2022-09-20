package org.composite.demo1;

public interface Component {
    void issue(String officialDocument);

    void add(Component component);

    void remove(Component component);

    Component get(int i);
}
