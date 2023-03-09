package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    @Order(1)
    public void urlShouldBeFixed() {
        Assertions.assertEquals(" https://booLeAn.co.uk/who-we-are ", this.exercise.fixedUrl);
    }

    @Test
    @Order(2)
    public void urlShouldBeLowerCase() {
        Assertions.assertEquals(" https://boolean.co.uk/who-we-are ", this.exercise.lowerCasedUrl);
    }

    @Test
    @Order(3)
    public void urlShouldBeTrimmed() {
        Assertions.assertEquals("https://boolean.co.uk/who-we-are", this.exercise.url);
    }

    @Test
    @Order(4)
    public void protocolShouldBeHttps() {
        Assertions.assertEquals("https", this.exercise.protocol);
    }

    @Test
    @Order(5)
    public void domainShouldBeBooleanCoUk() {
        Assertions.assertEquals("boolean.co.uk", this.exercise.domain);
    }

    @Test
    @Order(6)
    public void lengthShouldBe32() {
        Assertions.assertEquals(32, this.exercise.length);
    }

    @Test
    @Order(7)
    public void faqUrlShouldBeBooleanCoUkFaq() {
        Assertions.assertEquals("https://boolean.co.uk/faq", this.exercise.faqUrl);
    }
}
