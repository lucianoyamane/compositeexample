package br.lucianoyamane.compositeexample;

public class ComponentLeaf implements Component{

    private String leafValue;

    protected ComponentLeaf() {
        this.leafValue = "There is nothing";
    }

    public static ComponentLeaf init() {
        return new ComponentLeaf();
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Leaf ").append(this.leafValue).append(" \n");
        System.out.print(stringBuilder);
    }

    public final ComponentLeaf value(String value) {
        this.leafValue = value;
        return this;
    }
}
