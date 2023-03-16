package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void urlShouldBeFixed() {
        Assertions.assertEquals(" https://booLeAn.co.uk/who-we-are ", this.exercise.fixedUrl);
    }

    @Test
    public void urlShouldBeLowerCase() {
        Assertions.assertEquals(" https://boolean.co.uk/who-we-are ", this.exercise.lowerCasedUrl);
    }

    @Test
    public void urlShouldBeTrimmed() {
        Assertions.assertEquals("https://boolean.co.uk/who-we-are", this.exercise.url);
    }

    @Test
    public void protocolShouldBeHttps() {
        Assertions.assertEquals("https", this.exercise.protocol);
    }

    @Test
    public void domainShouldBeBooleanCoUk() {
        Assertions.assertEquals("boolean.co.uk", this.exercise.domain);
    }

    @Test
    public void lengthShouldBe32() {
        Assertions.assertEquals(32, this.exercise.length);
    }

    @Test
    public void faqUrlShouldBeBooleanCoUkFaq() {
        Assertions.assertEquals("https://boolean.co.uk/faq", this.exercise.faqUrl);
    }
}
