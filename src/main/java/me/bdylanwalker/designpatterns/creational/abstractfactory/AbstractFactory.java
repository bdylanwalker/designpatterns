package me.bdylanwalker.designpatterns.creational.abstractfactory;

abstract class AbstractFactory {
    String name;

    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();

    public String getName() {
        return this.name;

    }
}

