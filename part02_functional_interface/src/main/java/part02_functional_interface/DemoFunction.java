package part02_functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        System.out.println("---Function---");
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        int addAndMultiply = addBy1AndThenMultiplyBy10.apply(1);
        System.out.println(addAndMultiply);

        // BiFunction takes 2 argument and produces 1 result
        System.out.println("---BiFunction---");
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
