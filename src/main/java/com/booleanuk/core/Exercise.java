package com.booleanuk.core;

public class Exercise {
    // A URL consists of these parts: [protocol]://[domain]/[path]
    public String brokenUrl = " httpz://booLeAn.co.uk/who-we-are ";

    // 1. The brokenUrl member above contains an invalid URL. There's a z instead of an s in the protocol (httpz instead of https).
    // Using the `replace` method on brokenUrl, set the fixedUrl member below to the correct value.
    // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html#replace(char,char)
    public String fixedUrl = brokenUrl.replace("z","s");


    // Here's a documentation link for all string methods, use it to figure out how to complete the rest of these requirements:
    // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html#method-summary


    // 2. There are currently some upper case characters in the URL. Using an appropriate string method on the fixedUrl member above,
    // set the value of lowerCasedUrl.
    public String lowerCasedUrl = fixedUrl.toLowerCase();


    // 3. There is still white space on both ends of the URL! Use the appropriate string method to trim that white space
    // and set the value of the url member below
    public String url = lowerCasedUrl.trim();


    // 4. Using the appropriate string method on url, set the value of the protocol member below
    public String protocol = url.substring(0, url.indexOf("://"));


    // 5. Using the appropriate string method on url, set the value of the domain member below
    public String domain = url.substring(url.indexOf("b"), url.lastIndexOf("/"));


    // 6. Set the length member below to the length of the url member
    public int length = url.length();


    // 7. Using concatenation and existing members, set the faqUrl member below to the faq page of the boolean website
    public String faqUrl = protocol.concat("://").concat(domain + "/").concat("faq");
}
