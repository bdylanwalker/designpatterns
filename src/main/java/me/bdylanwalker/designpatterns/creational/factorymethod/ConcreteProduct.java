package me.bdylanwalker.designpatterns.creational.factorymethod;

public class ConcreteProduct implements Product {
    protected String name;

    public ConcreteProduct() {
        this.name = "ConcreteProduct";

    }

    @Override
    public String getName() {
        return this.name;
    }
}
