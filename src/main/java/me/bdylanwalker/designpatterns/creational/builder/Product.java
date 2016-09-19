package me.bdylanwalker.designpatterns.creational.builder;

public class Product {
    private String name;

    public Product( String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
