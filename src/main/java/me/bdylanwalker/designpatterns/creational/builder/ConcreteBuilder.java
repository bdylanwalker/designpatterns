package me.bdylanwalker.designpatterns.creational.builder;

public class ConcreteBuilder extends Builder {
    private Product product;

    public void buildPart() {
        product = new Product( "Product1");
    }

    public Product getResult() {
        return product;
    }
}
