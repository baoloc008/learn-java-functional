package part04_optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresent(System.out::println); // empty

        Optional.ofNullable("hello")
                .ifPresent(System.out::println); // hello

        Optional<String> hello = Optional.ofNullable("hello");

        String orElse = hello
                .map(String::toUpperCase)
                .orElse("world");
        System.out.println(orElse); // HELLO

        String orElseGet = hello
                .orElseGet(() -> {
                    // more logic
                    return "world";
                });
        System.out.println(orElseGet); // HELLO

        Optional.ofNullable("Hello")
                .ifPresent(System.out::println); // Hello
    }
}
