package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.*;

import asssert.core.exception.AssertException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousDoubleAssertTest {

    @Test
    @DisplayName("AnonymousDoubleAssert operators(success)")
    void test1() {
        Double actual1 = 1.0;
        Double actual2 = 2.1;
        Double actual3 = 3.2;

        Double expected1 = 1.0;
        Double expected2 = 2.1;
        Double expected3 = 3.2;

        AnonymousDoubleAssert doubleAssert = new AnonymousDoubleAssert();

        // actual < expected
        doubleAssert.isLessThan(actual1, expected2);

        // actual > expected
        doubleAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        doubleAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        doubleAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        doubleAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        doubleAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        doubleAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousDoubleAssert operators(fail)")
    void test2() {
        Double actual1 = 1.0;
        Double actual2 = 2.1;
        Double actual3 = 3.2;

        Double expected1 = 1.0;
        Double expected2 = 2.1;
        Double expected3 = 3.2;

        AnonymousDoubleAssert doubleAssert = new AnonymousDoubleAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> doubleAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> doubleAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> doubleAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> doubleAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> doubleAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> doubleAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> doubleAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> doubleAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousDoubleAssert method(success)")
    void test3() {
        Double actual1 = 1.0;
        Double actual2 = 2.0;
        Double actual3 = -1.0;
        Double actual4 = 3 / 0.0;
        Double actual5 = 5 % 0.0;


        AnonymousDoubleAssert doubleAssert = new AnonymousDoubleAssert();

        doubleAssert.isPositive(actual1);
        doubleAssert.isNegative(actual3);
        doubleAssert.isFinite(actual2);
        doubleAssert.isInfinity(actual4);
        doubleAssert.isNaN(actual5);

    }

    @Test
    @DisplayName("AnonymousDoubleAssert method(fail)")
    void test4() {

        Double actual1 = 1.0;
        Double actual2 = -1.0;
        Double actual3 = 3 / 0.0;
        Double actual4 = 5 % 0.0;

        AnonymousDoubleAssert doubleAssert = new AnonymousDoubleAssert();

        assertThrows(AssertException.class, () -> doubleAssert.isPositive(actual2));
        assertThrows(AssertException.class, () -> doubleAssert.isNegative(actual1));
        assertThrows(AssertException.class, () -> doubleAssert.isFinite(actual4));
        assertThrows(AssertException.class, () -> doubleAssert.isInfinity(actual4));
        assertThrows(AssertException.class, () -> doubleAssert.isNaN(actual3));

    }

}