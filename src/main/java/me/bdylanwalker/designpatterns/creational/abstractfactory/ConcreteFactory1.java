package me.bdylanwalker.designpatterns.creational.abstractfactory;

public class ConcreteFactory1 extends AbstractFactory {
    public ConcreteFactory1() {
        this.name = "Factory1";
    }

    public AbstractProductA createProductA() {
        return new ProductA1();

    }

    public AbstractProductB createProductB() {
        return new ProductB1();

    }
}
