package part02_functional_interface;

import java.util.function.Predicate;

public class DemoPredicate {
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("09") & phoneNumber.length() == 10;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    public static void main(String[] args) {
        // use normal function
        System.out.println("without predicate");
        System.out.println(isPhoneNumberValid("0966123456"));
        System.out.println(isPhoneNumberValid("0166123456"));

        // use predicate
        System.out.println("with predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0966123456"));
        System.out.println(isPhoneNumberValidPredicate.test("0166123456"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0966123456"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("09") & phoneNumber.length() == 10;
    }
}
