package br.lucianoyamane.compositeexample;

public class MainApplication {

    public static void main(String[] args) {
        ComponentComposite componentComposite = ComponentComposite.init();
        componentComposite.addComponent(ComponentLeaf.init().value("first"));
        componentComposite.addComponent(ComponentLeaf.init().value("second"));
        componentComposite.addComponent(ComponentLeaf.init().value("thirty"));

        ComponentComposite finalComponent = ComponentComposite.init();
        finalComponent.addComponent(componentComposite);
        finalComponent.addComponent(ComponentLeaf.init().value("fourth"));

        finalComponent.draw();
    }
}
