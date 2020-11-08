package part02_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class DemoSupplier {
    static Supplier<List<String>> getDBConnectionUrlsSupplier = () -> new ArrayList<>(Arrays.asList(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customers"
    ));

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
