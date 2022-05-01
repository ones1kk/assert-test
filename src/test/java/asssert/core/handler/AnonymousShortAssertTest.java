package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import asssert.core.exception.AssertException;
import asssert.core.feature.Offset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousShortAssertTest {

    @Test
    @DisplayName("AnonymousShortAssert(Short) operators(success)")
    void test1() {
        Short actual1 = 1;
        Short actual2 = 2;
        Short actual3 = 3;

        Short expected1 = 1;
        Short expected2 = 2;
        Short expected3 = 3;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();
        shortAssert.isLessThan(actual1, expected2);
        // actual < expected
        shortAssert.isLessThan(actual1, expected2);
        // actual > expected
        shortAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        shortAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        shortAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        shortAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        shortAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        shortAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousShortAssert(Short) operators(fail)")
    void test2() {
        Short actual1 = 1;
        Short actual2 = 2;
        Short actual3 = 3;

        Short expected1 = 1;
        Short expected2 = 2;
        Short expected3 = 3;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> shortAssert.isLessThan(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> shortAssert.isGreaterThan(actual1, expected2));

        // actual > expected
        assertThrows(AssertException.class,
            () -> shortAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> shortAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> shortAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> shortAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousShortAssert(short) operators(success)")
    void test3() {
        short actual1 = 1;
        short actual2 = 2;
        short actual3 = 3;

        short expected1 = 1;
        short expected2 = 2;
        short expected3 = 3;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();
        shortAssert.isLessThan(actual1, expected2);
        // actual < expected
        shortAssert.isLessThan(actual1, expected2);
        // actual > expected
        shortAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        shortAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        shortAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        shortAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        shortAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        shortAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousShortAssert(short) operators(fail)")
    void test4() {
        short actual1 = 1;
        short actual2 = 2;
        short actual3 = 3;

        short expected1 = 1;
        short expected2 = 2;
        short expected3 = 3;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> shortAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> shortAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> shortAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> shortAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> shortAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> shortAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> shortAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> shortAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousShortAssert method(success)")
    void test5() {
        Short actual1 = 1;
        Short actual2 = 2;
        Short actual3 = 0;
        Short actual4 = -1;

        short actual5 = 1;
        short actual6 = 2;
        short actual7 = 0;
        short actual8 = -1;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();

        shortAssert.isPositive(actual1);
        shortAssert.isPositive(actual5);

        shortAssert.isNegative(actual4);
        shortAssert.isNegative(actual8);

        shortAssert.isEven(actual2);
        shortAssert.isEven(actual6);
        shortAssert.isEven(actual3);
        shortAssert.isEven(actual7);

        shortAssert.isOdd(actual1);
        shortAssert.isOdd(actual5);
    }

    @Test
    @DisplayName("AnonymousShortAssert method(fail)")
    void test6() {

        Short actual1 = 1;
        Short actual2 = 2;
        Short actual3 = 0;
        Short actual4 = -1;

        short actual5 = 1;
        short actual6 = 2;
        short actual7 = 0;
        short actual8 = -1;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();
        assertThrows(AssertException.class, () -> shortAssert.isPositive(actual4));
        assertThrows(AssertException.class, () -> shortAssert.isPositive(actual8));

        assertThrows(AssertException.class, () -> shortAssert.isNegative(actual1));
        assertThrows(AssertException.class, () -> shortAssert.isNegative(actual5));

        assertThrows(AssertException.class, () -> shortAssert.isEven(actual1));
        assertThrows(AssertException.class, () -> shortAssert.isEven(actual5));

        assertThrows(AssertException.class, () -> shortAssert.isOdd(actual2));
        assertThrows(AssertException.class, () -> shortAssert.isOdd(actual6));
        assertThrows(AssertException.class, () -> shortAssert.isOdd(actual3));
        assertThrows(AssertException.class, () -> shortAssert.isOdd(actual7));

    }

    @Test
    @DisplayName("NumberAssert test(success)")
    void test7() {
        Short actual1 = 10;
        Short actual2 = 0;
        Short actual3 = -10;
        Short actual4 = 5;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();

        shortAssert.isNotZero(actual1);
        shortAssert.isZero(actual2);
        shortAssert.isNotPositive(actual3);
        shortAssert.isNotNegative(actual1);
        shortAssert.isCloseTo(actual4, actual1, Offset.offset((short) 5));
        shortAssert.isNotCloseTo(actual4, actual1, Offset.offset((short) 2));
    }

    @Test
    @DisplayName("NumberAssert test(fail)")
    void test8() {
        Short actual1 = 10;
        Short actual2 = 0;
        Short actual3 = -10;
        Short actual4 = 5;

        AnonymousShortAssert shortAssert = new AnonymousShortAssert();

        Assertions.assertThrows(AssertException.class, () -> shortAssert.isNotZero(actual2));
        Assertions.assertThrows(AssertException.class, () -> shortAssert.isZero(actual1));
        Assertions.assertThrows(AssertException.class, () -> shortAssert.isNotPositive(actual1));
        Assertions.assertThrows(AssertException.class, () -> shortAssert.isNotNegative(actual3));
        Assertions.assertThrows(AssertException.class,
            () -> shortAssert.isCloseTo(actual4, actual1, Offset.offset((short) 2)));
        Assertions.assertThrows(AssertException.class,
            () -> shortAssert.isNotCloseTo(actual4, actual1, Offset.offset((short) 9)));

    }
}