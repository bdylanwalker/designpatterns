package me.bdylanwalker.designpatterns.creational.abstractfactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AbstractFactoryPatternTest
{
    private final Logger logger = LoggerFactory.getLogger( this.getClass());

    @Test
    public void testClient() {
        assertThat( true, is( true));

    }
}