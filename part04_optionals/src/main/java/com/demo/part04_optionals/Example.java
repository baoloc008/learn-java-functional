package com.demo.part04_optionals;

public class Example {
    public static void main(String[] args) {
        Person person = new Person("james", "james@GMAIL.COM");

        String email = person.getEmail()
                .map(String::toLowerCase)
                .orElse("email not provied");
        System.out.println(email);
    }
}
