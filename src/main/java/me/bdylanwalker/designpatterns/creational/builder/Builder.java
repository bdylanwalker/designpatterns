package me.bdylanwalker.designpatterns.creational.builder;

public abstract class Builder {
    public abstract void buildPart();
    public abstract Product getResult();
}
