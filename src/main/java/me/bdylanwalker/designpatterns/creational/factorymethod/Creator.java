package me.bdylanwalker.designpatterns.creational.factorymethod;

public abstract class Creator {
    Product product;

    public abstract Product FactoryMethod();

    public Product AnOperation() {
        return getProduct();

    }

    public Product getProduct() {
        if ( null == product) {
            product = FactoryMethod();
        }

        return this.product;

    }

}
