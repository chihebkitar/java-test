package basic;

import io.vavr.control.Option;

public class Main {
    public static void main(String[] args) {
        testPower(2, 3);
        testPower(0, 5);
        testPower(5, 0);
        testPower(10, 2);

    }

    private static void testPower(Integer base, Integer exponent) {
        Option<Integer> res = BasicTest.power(base, exponent);
        Integer n = res.getOrElse(() -> null);
        System.out.println("Power(" + base + ", " + exponent + ") = " + n);
    }
}
