package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {
    Extension extension;

    public ExtensionTest() {
        this.extension = new Extension();
    }

    @Test
    public void helloWorldShouldBeAppended() {
        Assertions.assertEquals("Hello, world!", this.extension.one().toString());
    }

    @Test
    public void helloWorldShouldBeReversed() {
        Assertions.assertEquals("!dlrow ,olleH", this.extension.two().toString());
    }

    @Test
    public void commaShouldBeRemoved() {
        Assertions.assertEquals("Hello world!", this.extension.three().toString());
    }

    @Test
    public void shouldSayHelloToJava() {
        Assertions.assertEquals("Hello, Java!", this.extension.four().toString());
    }
}
