package me.bdylanwalker.designpatterns.creational.factorymethod;

public class ConcreteCreator extends Creator {

    @Override
    public Product FactoryMethod() {
        return new ConcreteProduct();

    }

}
