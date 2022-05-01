package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.*;

import asssert.core.exception.AssertException;
import asssert.core.feature.Offset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousFloatAssertTest {

    @Test
    @DisplayName("AnonymousFloatAssert operators(success)")
    void test1() {
        Float actual1 = 1.0F;
        Float actual2 = 2.1F;
        Float actual3 = 3.2F;

        Float expected1 = 1.0F;
        Float expected2 = 2.1F;
        Float expected3 = 3.2F;

        AnonymousFloatAssert floatAssert = new AnonymousFloatAssert();

        // actual < expected
        floatAssert.isLessThan(actual1, expected2);

        // actual > expected
        floatAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        floatAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        floatAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        floatAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        floatAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        floatAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousFloatAssert operators(fail)")
    void test2() {
        Float actual1 = 1.0F;
        Float actual2 = 2.1F;
        Float actual3 = 3.2F;

        Float expected1 = 1.0F;
        Float expected2 = 2.1F;
        Float expected3 = 3.2F;

        AnonymousFloatAssert floatAssert = new AnonymousFloatAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> floatAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> floatAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> floatAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> floatAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> floatAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> floatAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> floatAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> floatAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousFloatAssert method(success)")
    void test3() {
        Float actual1 = 1.0F;
        Float actual2 = 2.0F;
        Float actual3 = -1.0F;
        Float actual4 = 3 / 0.0F;
        Float actual5 = 5 % 0.0F;

        AnonymousFloatAssert floatAssert = new AnonymousFloatAssert();

        floatAssert.isPositive(actual1);
        floatAssert.isNegative(actual3);
        floatAssert.isFinite(actual2);
        floatAssert.isInfinity(actual4);
        floatAssert.isNaN(actual5);

    }

    @Test
    @DisplayName("AnonymousFloatAssert method(fail)")
    void test4() {

        Float actual1 = 1.0F;
        Float actual2 = -1.0F;
        Float actual3 = 3 / 0.0F;
        Float actual4 = 5 % 0.0F;

        AnonymousFloatAssert floatAssert = new AnonymousFloatAssert();

        assertThrows(AssertException.class, () -> floatAssert.isPositive(actual2));
        assertThrows(AssertException.class, () -> floatAssert.isNegative(actual1));
        assertThrows(AssertException.class, () -> floatAssert.isFinite(actual4));
        assertThrows(AssertException.class, () -> floatAssert.isInfinity(actual4));
        assertThrows(AssertException.class, () -> floatAssert.isNaN(actual3));

    }

    @Test
    @DisplayName("NumberAssert test(success)")
    void test5() {
        Float actual1 = 10.0F;
        Float actual2 = 0.0F;
        Float actual3 = -10.0F;
        Float actual4 = 5.0F;

        AnonymousFloatAssert floatAssert = new AnonymousFloatAssert();

        floatAssert.isNotZero(actual1);
        floatAssert.isZero(actual2);
        floatAssert.isNotPositive(actual3);
        floatAssert.isNotNegative(actual1);
        floatAssert.isCloseTo(actual4, actual1, Offset.offset(5.0F));
        floatAssert.isNotCloseTo(actual4, actual1, Offset.offset(2.0F));
    }

    @Test
    @DisplayName("NumberAssert test(fail)")
    void test6() {
        Float actual1 = 10.0F;
        Float actual2 = 0.0F;
        Float actual3 = -10.0F;
        Float actual4 = 5.0F;

        AnonymousFloatAssert floatAssert = new AnonymousFloatAssert();

        Assertions.assertThrows(AssertException.class, () -> floatAssert.isNotZero(actual2));
        Assertions.assertThrows(AssertException.class, () -> floatAssert.isZero(actual1));
        Assertions.assertThrows(AssertException.class, () -> floatAssert.isNotPositive(actual1));
        Assertions.assertThrows(AssertException.class, () -> floatAssert.isNotNegative(actual3));
        Assertions.assertThrows(AssertException.class,
            () -> floatAssert.isCloseTo(actual4, actual1, Offset.offset(2.0F)));
        Assertions.assertThrows(AssertException.class,
            () -> floatAssert.isNotCloseTo(actual4, actual1, Offset.offset(9.0F)));

    }

}