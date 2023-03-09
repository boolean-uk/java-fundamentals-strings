package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExtensionTest {
    Extension extension;

    public ExtensionTest() {
        this.extension = new Extension();
    }

    @Test
    @Order(1)
    public void helloWorldShouldBeAppended() {
        Assertions.assertEquals("Hello, world!", this.extension.one().toString());
    }

    @Test
    @Order(2)
    public void helloWorldShouldBeReversed() {
        Assertions.assertEquals("!dlrow ,olleH", this.extension.two().toString());
    }

    @Test
    @Order(3)
    public void commaShouldBeRemoved() {
        Assertions.assertEquals("Hello world!", this.extension.three().toString());
    }

    @Test
    @Order(4)
    public void shouldSayHelloToJava() {
        Assertions.assertEquals("Hello, Java!", this.extension.four().toString());
    }
}
