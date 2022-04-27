package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import asssert.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousIntegerAssertTest {

    @Test
    @DisplayName("AnonymousIntegerAssert(Integer) operators(success)")
    void test1() {
        Integer actual1 = 1;
        Integer actual2 = 2;
        Integer actual3 = 3;

        Integer expected1 = 1;
        Integer expected2 = 2;
        Integer expected3 = 3;

        AnonymousIntegerAssert integerAssert = new AnonymousIntegerAssert();
        integerAssert.isLessThan(actual1, expected2);
        // actual < expected
        integerAssert.isLessThan(actual1, expected2);
        // actual > expected
        integerAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        integerAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        integerAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        integerAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        integerAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        integerAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousIntegerAssert(Integer) operators(fail)")
    void test2() {
        Integer actual1 = 1;
        Integer actual2 = 2;
        Integer actual3 = 3;

        Integer expected1 = 1;
        Integer expected2 = 2;
        Integer expected3 = 3;

        AnonymousIntegerAssert integerAssert = new AnonymousIntegerAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> integerAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> integerAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> integerAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> integerAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> integerAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> integerAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> integerAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> integerAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousIntegerAssert(int) operators(success)")
    void test3() {
        int actual1 = 1;
        int actual2 = 2;
        int actual3 = 3;

        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;

        AnonymousIntegerAssert integerAssert = new AnonymousIntegerAssert();
        integerAssert.isLessThan(actual1, expected2);
        // actual < expected
        integerAssert.isLessThan(actual1, expected2);
        // actual > expected
        integerAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        integerAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        integerAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        integerAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        integerAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        integerAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousIntegerAssert(int) operators(fail)")
    void test4() {
        int actual1 = 1;
        int actual2 = 2;
        int actual3 = 3;

        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;

        AnonymousIntegerAssert integerAssert = new AnonymousIntegerAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> integerAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> integerAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> integerAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> integerAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> integerAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> integerAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> integerAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> integerAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousIntegerAssert method(success)")
    void test5() {
        Integer actual1 = 1;
        Integer actual2 = 2;
        Integer actual3 = 0;
        Integer actual4 = -1;

        int actual5 = 1;
        int actual6 = 2;
        int actual7 = 0;
        int actual8 = -1;

        AnonymousIntegerAssert integerAssert = new AnonymousIntegerAssert();

        integerAssert.isPositive(actual1);
        integerAssert.isPositive(actual5);

        integerAssert.isNegative(actual4);
        integerAssert.isNegative(actual8);

        integerAssert.isEven(actual2);
        integerAssert.isEven(actual6);
        integerAssert.isEven(actual3);
        integerAssert.isEven(actual7);

        integerAssert.isOdd(actual1);
        integerAssert.isOdd(actual5);
    }

    @Test
    @DisplayName("AnonymousIntegerAssert method(fail)")
    void test6() {

        Integer actual1 = 1;
        Integer actual2 = 2;
        Integer actual3 = 0;
        Integer actual4 = -1;

        int actual5 = 1;
        int actual6 = 2;
        int actual7 = 0;
        int actual8 = -1;

        AnonymousIntegerAssert integerAssert = new AnonymousIntegerAssert();
        assertThrows(AssertException.class, () -> integerAssert.isPositive(actual4));
        assertThrows(AssertException.class, () -> integerAssert.isPositive(actual8));

        assertThrows(AssertException.class, () -> integerAssert.isNegative(actual1));
        assertThrows(AssertException.class, () -> integerAssert.isNegative(actual5));

        assertThrows(AssertException.class, () -> integerAssert.isEven(actual1));
        assertThrows(AssertException.class, () -> integerAssert.isEven(actual5));

        assertThrows(AssertException.class, () -> integerAssert.isOdd(actual2));
        assertThrows(AssertException.class, () -> integerAssert.isOdd(actual6));
        assertThrows(AssertException.class, () -> integerAssert.isOdd(actual3));
        assertThrows(AssertException.class, () -> integerAssert.isOdd(actual7));

    }
}