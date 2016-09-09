package me.bdylanwalker.designpatterns.creational.abstractfactory;

public class ConcreteFactory2 extends AbstractFactory {
    public ConcreteFactory2() {
        this.name = "Factory2";

    }
    public AbstractProductA createProductA() {
        return new ProductA2();

    }
    public AbstractProductB createProductB() {
        return new ProductB2();

    }
}
