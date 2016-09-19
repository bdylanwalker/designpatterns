package me.bdylanwalker.designpatterns.creational.prototype;

public abstract class Prototype implements Cloneable
{
    protected String name;

    public Prototype Clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

    public String getName() {
        return this.name;
    }

}
