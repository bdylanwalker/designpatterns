package me.bdylanwalker.designpatterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="http://yuml.me/diagram/scruffy/class/
 * [Client]-.->[ConcreteBuilder],
 * [Client]-.->[Director],
 * [Director||Construct()]+->[Builder||BuildPart()],
 * [Builder]^-[ConcreteBuilder||BuildPart();GetResult()],
 * [ConcreteBuilder]-.->[Product]
 * ">UML Diagram</a>
 */
public class Client {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String... args) {
        new Client().run( args);

    }

    public void run(String... args) {
        logger.info("BEGIN");
        logger.info("Builder");

        try {

            Builder b = new ConcreteBuilder();
            Director d = new Director(b);

            d.construct();

            Product p = b.getResult();

            logger.info("\t{}", p.getName());

        } finally {
            logger.info("END");

        }
    }
}
