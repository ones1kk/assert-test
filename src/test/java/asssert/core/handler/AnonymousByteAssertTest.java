package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import asssert.core.exception.AssertException;
import asssert.core.feature.Offset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousByteAssertTest {

    @Test
    @DisplayName("AnonymousByteAssert(Byte) operators(success)")
    void test1() {
        Byte actual1 = 1;
        Byte actual2 = 2;
        Byte actual3 = 3;

        Byte expected1 = 1;
        Byte expected2 = 2;
        Byte expected3 = 3;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();
        byteAssert.isLessThan(actual1, expected2);
        // actual < expected
        byteAssert.isLessThan(actual1, expected2);
        // actual > expected
        byteAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        byteAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        byteAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        byteAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        byteAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        byteAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousByteAssert(Byte) operators(fail)")
    void test2() {
        Byte actual1 = 1;
        Byte actual2 = 2;
        Byte actual3 = 3;

        Byte expected1 = 1;
        Byte expected2 = 2;
        Byte expected3 = 3;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> byteAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> byteAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> byteAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> byteAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> byteAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> byteAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> byteAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> byteAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousByteAssert(byte) operators(success)")
    void test3() {
        byte actual1 = 1;
        byte actual2 = 2;
        byte actual3 = 3;

        byte expected1 = 1;
        byte expected2 = 2;
        byte expected3 = 3;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();
        byteAssert.isLessThan(actual1, expected2);
        // actual < expected
        byteAssert.isLessThan(actual1, expected2);
        // actual > expected
        byteAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        byteAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        byteAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        byteAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        byteAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        byteAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousByteAssert(byte) operators(fail)")
    void test4() {
        byte actual1 = 1;
        byte actual2 = 2;
        byte actual3 = 3;

        byte expected1 = 1;
        byte expected2 = 2;
        byte expected3 = 3;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> byteAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> byteAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> byteAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> byteAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> byteAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> byteAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> byteAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> byteAssert.isBetween(actual3, expected1, expected2));
    }

    @Test
    @DisplayName("AnonymousByteAssert method(success)")
    void test5() {
        Byte actual1 = 1;
        Byte actual2 = 2;
        Byte actual3 = 0;
        Byte actual4 = -1;

        byte actual5 = 1;
        byte actual6 = 2;
        byte actual7 = 0;
        byte actual8 = -1;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();

        byteAssert.isPositive(actual1);
        byteAssert.isPositive(actual5);

        byteAssert.isNegative(actual4);
        byteAssert.isNegative(actual8);

        byteAssert.isEven(actual2);
        byteAssert.isEven(actual6);
        byteAssert.isEven(actual3);
        byteAssert.isEven(actual7);

        byteAssert.isOdd(actual1);
        byteAssert.isOdd(actual5);
    }

    @Test
    @DisplayName("AnonymousByteAssert method(fail)")
    void test6() {

        Byte actual1 = 1;
        Byte actual2 = 2;
        Byte actual3 = 0;
        Byte actual4 = -1;

        byte actual5 = 1;
        byte actual6 = 2;
        byte actual7 = 0;
        byte actual8 = -1;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();
        assertThrows(AssertException.class, () -> byteAssert.isPositive(actual4));
        assertThrows(AssertException.class, () -> byteAssert.isPositive(actual8));

        assertThrows(AssertException.class, () -> byteAssert.isNegative(actual1));
        assertThrows(AssertException.class, () -> byteAssert.isNegative(actual5));

        assertThrows(AssertException.class, () -> byteAssert.isEven(actual1));
        assertThrows(AssertException.class, () -> byteAssert.isEven(actual5));

        assertThrows(AssertException.class, () -> byteAssert.isOdd(actual2));
        assertThrows(AssertException.class, () -> byteAssert.isOdd(actual6));
        assertThrows(AssertException.class, () -> byteAssert.isOdd(actual3));
        assertThrows(AssertException.class, () -> byteAssert.isOdd(actual7));

    }

    @Test
    @DisplayName("NumberAssert test(success)")
    void test7() {
        Byte actual1 = 10;
        Byte actual2 = 0;
        Byte actual3 = -10;
        Byte actual4 = 5;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();

        byteAssert.isNotZero(actual1);
        byteAssert.isZero(actual2);
        byteAssert.isNotPositive(actual3);
        byteAssert.isNotNegative(actual1);
        byteAssert.isCloseTo(actual4, actual1, Offset.offset((byte) 5));
        byteAssert.isNotCloseTo(actual4, actual1, Offset.offset((byte) 2));
    }

    @Test
    @DisplayName("NumberAssert test(fail)")
    void test8() {
        Byte actual1 = 10;
        Byte actual2 = 0;
        Byte actual3 = -10;
        Byte actual4 = 5;

        AnonymousByteAssert byteAssert = new AnonymousByteAssert();

        Assertions.assertThrows(AssertException.class, () -> byteAssert.isNotZero(actual2));
        Assertions.assertThrows(AssertException.class, () -> byteAssert.isZero(actual1));
        Assertions.assertThrows(AssertException.class, () -> byteAssert.isNotPositive(actual1));
        Assertions.assertThrows(AssertException.class, () -> byteAssert.isNotNegative(actual3));
        Assertions.assertThrows(AssertException.class,
            () -> byteAssert.isCloseTo(actual4, actual1, Offset.offset((byte) 2)));
        Assertions.assertThrows(AssertException.class,
            () -> byteAssert.isNotCloseTo(actual4, actual1, Offset.offset((byte) 9)));

    }
}