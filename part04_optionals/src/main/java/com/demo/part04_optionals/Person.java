package com.demo.part04_optionals;

import java.util.Optional;

public class Person {
    private final String name;
    private final String email;

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
