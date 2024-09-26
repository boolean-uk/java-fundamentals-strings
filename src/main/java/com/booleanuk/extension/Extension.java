package com.booleanuk.extension;

public class Extension {
    // In Java, Strings are immutable. If we want to change a string, we need to create new variables or members that
    // contain the new value. Consider the below code that builds a welcome message for a user:
    String message = "Hello";
    String message2 = message + ", John Smith!";
    String message3 = message2 + " Welcome to my app.";

    // As you can see, it's difficult to construct something as simple as a welcome message this way. If we want to
    // work with a mutable string, we should use another approach. One option is to use the StringBuilder class:
    // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/StringBuilder.html

    // The following block of code is a method. You've been using these during the core criteria, and this is how we
    // create our own methods. You'll be doing this in a future exercise. For now, write your code between the
    // WRITE YOUR CODE BETWEEN THIS LINE...
    // ... AND THIS LINE
    // See the below example:
    public void example() {
        // 0. Print the word "Hello"
        // WRITE YOUR CODE BETWEEN THIS LINE...
        System.out.println("Hello");
        // ...AND THIS LINE
    }

    public StringBuilder one() {
        StringBuilder sb = new StringBuilder();

        // 1. Using the sb variable above, add "Hello, world!" to the StringBuilder
        // WRITE YOUR CODE BETWEEN THIS LINE...

        sb.append("Hello, world!");

        // ...AND THIS LINE

        return sb;
    }

    public StringBuilder two() {
        StringBuilder sb = new StringBuilder();

        // 1. Using the sb variable above, add "Hello, world!" to the StringBuilder
        // 2. After adding the message, use an appropriate StringBuilder method to reverse it
        // WRITE YOUR CODE BETWEEN THIS LINE...

        sb.append("Hello, world!");
        sb.reverse();

        // ...AND THIS LINE

        return sb;
    }

    public StringBuilder three() {
        StringBuilder sb = new StringBuilder();

        // 1. Using the sb variable above, add "Hello, world!" to the StringBuilder
        // 2. After adding the message, remove the comma.
        // WRITE YOUR CODE BETWEEN THIS LINE...

        sb.append("Hello, world!");
        sb.deleteCharAt(5);

        // ...AND THIS LINE

        return sb;
    }

    public StringBuilder four() {
        StringBuilder sb = new StringBuilder();

        // 1. Using the sb variable above, add "Hello, world!" to the StringBuilder
        // 2. After adding the message, replace the word "world" with the word "Java"
        // WRITE YOUR CODE BETWEEN THIS LINE...

        sb.append("Hello, world!");
        sb.replace(7,12, "Java");

        // ...AND THIS LINE

        return sb;
    }
}
