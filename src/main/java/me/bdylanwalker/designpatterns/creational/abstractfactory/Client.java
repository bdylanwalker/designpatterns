package me.bdylanwalker.designpatterns.creational.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="http://yuml.me/diagram/scruffy/class/
 * [AbstractFactory||+CreateProductA();+CreateProductB()]^-[ConcreteFactory1||+CreateProductA();+CreateProductB()],
 * [AbstractFactory]^-[ConcreteFactory2||+CreateProductA();+CreateProductB()],
 * [AbstractProductA]^-[ProductA1],
 * [AbstractProductA]^-[ProductA2],
 * [AbstractProductB]^-[ProductB1],
 * [AbstractProductB]^-[ProductB2],
 * [Client]->[AbstractFactory],
 * [Client]->[AbstractProductA],
 * [Client]->[AbstractProductB]"
 * >UML Diagram</a>
 */
public class Client {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String... args) {
        new Client().run( args);

    }

    public void run(String... args) {
        logger.info("BEGIN");
        AbstractFactory f;
        AbstractProductA pa;
        AbstractProductB pb;

        try {
            f = new ConcreteFactory1();
            pa = f.createProductA();
            logger.info("\t{}-{}", f.getName(), pa.getName());

            pb = f.createProductB();
            logger.info("\t{}-{}", f.getName(), pb.getName());

            f = new ConcreteFactory2();
            pa = f.createProductA();
            logger.info("\t{}-{}", f.getName(), pa.getName());

            pb = f.createProductB();
            logger.info("\t{}-{}", f.getName(), pb.getName());

        } finally {
            logger.info("END");

        }

    }
}
