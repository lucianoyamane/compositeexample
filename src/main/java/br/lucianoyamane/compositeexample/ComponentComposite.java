package br.lucianoyamane.compositeexample;

import java.util.ArrayList;
import java.util.List;

public class ComponentComposite implements Component {

    private List<Component> componentList;

    private ComponentComposite() {
        this.componentList = new ArrayList<>();
    }

    public static ComponentComposite init() {
        return new ComponentComposite();
    }

    @Override
    public void draw() {
        System.out.print(" Composite \n");
        for (Component component :
                componentList) {
            component.draw();
        }
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }
}
