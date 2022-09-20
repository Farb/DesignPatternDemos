package org.composite.demo2;

public class Client {
    public static void main(String[] args) {
        Component form = new Container("Form");
        Component btn = new UnitControl("Button");
        Component checkBox = new UnitControl("CheckBox");
        Component panel = new Container("Panel");
        form.add(btn);
        form.add(checkBox);
        form.add(panel);

        Component radioBtn = new UnitControl("RatioButton");
        panel.add(radioBtn);

        form.operation();

        panel.operation();

        btn.operation();
    }
}
