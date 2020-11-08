package part07_lambdas;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // Function<String, String> upperCaseName = String::toUpperCase;
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if (name.isEmpty()) {
                throw new IllegalArgumentException("name must not be empty");
            }
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply("Alex", 20));
    }
}
