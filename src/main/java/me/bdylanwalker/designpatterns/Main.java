package me.bdylanwalker.designpatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        logger.info("BEGIN");
        try {

            //# CREATIONAL

            //## Abstract Factory
            me.bdylanwalker.designpatterns.creational.abstractfactory.Client.main( args);

            //## Builder
            me.bdylanwalker.designpatterns.creational.builder.Client.main( args);

            //## Factory Method
            me.bdylanwalker.designpatterns.creational.factorymethod.Client.main( args);


        } finally {
            logger.info("END");

        }

    }
}
