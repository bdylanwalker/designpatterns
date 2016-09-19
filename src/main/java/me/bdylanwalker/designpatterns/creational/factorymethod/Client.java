package me.bdylanwalker.designpatterns.creational.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="http://yuml.me/diagram/scruffy/class/
 * [Creator||FactoryMethod();AnOperation()]^-[ConcreteCreator||FactoryMethod()],
 * [Product]^-[ConcreteProduct],
 * [ConcreteCreator]-.->[ConcreteProduct]
 * ">UML Diagram</a>
 */
public class Client {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String... args) {
        new Client().run( args);

    }

    public void run(String... args) {
        logger.info("BEGIN");
        logger.info("Factory Method");

        try {
            Creator creator = new ConcreteCreator();
            Product product = creator.getProduct();

            logger.info( "\t{}", product.getName());

        } finally {
            logger.info("END");

        }

    }
}
