package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import asssert.core.exception.AssertException;
import asssert.core.feature.Offset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousLongAssertTest {

    @Test
    @DisplayName("AnonymousLongAssert(Long) operators(success)")
    void test1() {
        Long actual1 = 1L;
        Long actual2 = 2L;
        Long actual3 = 3L;

        Long expected1 = 1L;
        Long expected2 = 2L;
        Long expected3 = 3L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();
        longAssert.isLessThan(actual1, expected2);
        // actual < expected
        longAssert.isLessThan(actual1, expected2);
        // actual > expected
        longAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        longAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        longAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        longAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        longAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        longAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousLongAssert(Long) operators(fail)")
    void test2() {
        Long actual1 = 1L;
        Long actual2 = 2L;
        Long actual3 = 3L;

        Long expected1 = 1L;
        Long expected2 = 2L;
        Long expected3 = 3L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> longAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> longAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> longAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> longAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> longAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> longAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> longAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> longAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousLongAssert(long) operators(success)")
    void test3() {
        long actual1 = 1L;
        long actual2 = 2L;
        long actual3 = 3L;

        long expected1 = 1L;
        long expected2 = 2L;
        long expected3 = 3L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();
        longAssert.isLessThan(actual1, expected2);
        // actual < expected
        longAssert.isLessThan(actual1, expected2);
        // actual > expected
        longAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        longAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        longAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        longAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        longAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        longAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousLongAssert(long) operators(fail)")
    void test4() {
        long actual1 = 1L;
        long actual2 = 2L;
        long actual3 = 3L;

        long expected1 = 1L;
        long expected2 = 2L;
        long expected3 = 3L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> longAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> longAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> longAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> longAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> longAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> longAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> longAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> longAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousLongAssert method(success)")
    void test5() {
        Long actual1 = 1L;
        Long actual2 = 2L;
        Long actual3 = 0L;
        Long actual4 = -1L;

        long actual5 = 1L;
        long actual6 = 2L;
        long actual7 = 0L;
        long actual8 = -1L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();

        longAssert.isPositive(actual1);
        longAssert.isPositive(actual5);

        longAssert.isNegative(actual4);
        longAssert.isNegative(actual8);

        longAssert.isEven(actual2);
        longAssert.isEven(actual6);
        longAssert.isEven(actual3);
        longAssert.isEven(actual7);

        longAssert.isOdd(actual1);
        longAssert.isOdd(actual5);
    }

    @Test
    @DisplayName("AnonymousLongAssert method(fail)")
    void test6() {

        Long actual1 = 1L;
        Long actual2 = 2L;
        Long actual3 = 0L;
        Long actual4 = -1L;

        long actual5 = 1L;
        long actual6 = 2L;
        long actual7 = 0L;
        long actual8 = -1L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();
        assertThrows(AssertException.class, () -> longAssert.isPositive(actual4));
        assertThrows(AssertException.class, () -> longAssert.isPositive(actual8));

        assertThrows(AssertException.class, () -> longAssert.isNegative(actual1));
        assertThrows(AssertException.class, () -> longAssert.isNegative(actual5));

        assertThrows(AssertException.class, () -> longAssert.isEven(actual1));
        assertThrows(AssertException.class, () -> longAssert.isEven(actual5));

        assertThrows(AssertException.class, () -> longAssert.isOdd(actual2));
        assertThrows(AssertException.class, () -> longAssert.isOdd(actual6));
        assertThrows(AssertException.class, () -> longAssert.isOdd(actual3));
        assertThrows(AssertException.class, () -> longAssert.isOdd(actual7));

    }

    @Test
    @DisplayName("NumberAssert test(success)")
    void test7() {
        Long actual1 = 10L;
        Long actual2 = 0L;
        Long actual3 = -10L;
        Long actual4 = 5L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();

        longAssert.isNotZero(actual1);
        longAssert.isZero(actual2);
        longAssert.isNotPositive(actual3);
        longAssert.isNotNegative(actual1);
        longAssert.isCloseTo(actual4, actual1, Offset.offset(5L));
        longAssert.isNotCloseTo(actual4, actual1, Offset.offset(2L));
    }

    @Test
    @DisplayName("NumberAssert test(fail)")
    void test8() {
        Long actual1 = 10L;
        Long actual2 = 0L;
        Long actual3 = -10L;
        Long actual4 = 5L;

        AnonymousLongAssert longAssert = new AnonymousLongAssert();

        Assertions.assertThrows(AssertException.class, () -> longAssert.isNotZero(actual2));
        Assertions.assertThrows(AssertException.class, () -> longAssert.isZero(actual1));
        Assertions.assertThrows(AssertException.class, () -> longAssert.isNotPositive(actual1));
        Assertions.assertThrows(AssertException.class, () -> longAssert.isNotNegative(actual3));
        Assertions.assertThrows(AssertException.class,
            () -> longAssert.isCloseTo(actual4, actual1, Offset.offset(2L)));
        Assertions.assertThrows(AssertException.class,
            () -> longAssert.isNotCloseTo(actual4, actual1, Offset.offset(9L)));

    }

}