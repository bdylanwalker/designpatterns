package me.bdylanwalker.designpatterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="http://yuml.me/diagram/scruffy/class/
 * [Prototype||Clone()]^-[ConcretePrototype1||Clone()],
 * [Prototype||Clone()]^-[ConcretePrototype2||Clone()],
 * [Client]->[Prototype]
 * ">UML Diagram</a>
 */
public class Client
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String... args) {
        new Client().run( args);

    }

    public void run(String... args) {
        logger.info("BEGIN");
        logger.info("Prototype");

        Prototype prototype;
        Prototype clone;

        try {
            prototype = new ConcretePrototype1();
            clone = prototype.Clone();

            logger.info("\tprototype:{}, clone:{}", prototype.hashCode(), clone.hashCode());
            logger.info("\t{}", clone.getName());

            prototype = new ConcretePrototype2();
            clone = prototype.Clone();

            logger.info("\tprototype:{}, clone:{}", prototype.hashCode(), clone.hashCode());
            logger.info("\t{}", clone.getName());

        } catch (CloneNotSupportedException cnse) {
            logger.error( "caught exception while cloning prototype", cnse);

        } finally {
            logger.info("END");

        }

    }
}
