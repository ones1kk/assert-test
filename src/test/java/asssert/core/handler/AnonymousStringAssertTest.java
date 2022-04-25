package asssert.core.handler;

import asssert.core.exception.AssertException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousStringAssertTest {

    @Test
    @DisplayName("AnonymousStringAssert operators(success)")
    void test1() {
        String actual1 = "A";
        String actual2 = "B";
        String actual3 = "C";

        String expected1 = "A";
        String expected2 = "B";
        String expected3 = "C";

        AnonymousStringAssert stringAssert = new AnonymousStringAssert();

        // actual < expected
        stringAssert.isLessThan(actual1, expected2);
        // actual > expected
        stringAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        stringAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        stringAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        stringAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        stringAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        stringAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousStringAssert operators(fail)")
    void test2() {
        String actual1 = "A";
        String actual2 = "B";
        String actual3 = "C";

        String expected1 = "A";
        String expected2 = "B";
        String expected3 = "C";

        AnonymousStringAssert stringAssert = new AnonymousStringAssert();

        // actual > expected
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isLessThan(actual2, expected1));
        // actual == expected
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isLessThan(actual2, expected2));

        // actual < expected
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        Assertions.assertThrows(AssertException.class,
            () -> stringAssert.isBetween(actual3, expected1, expected2));

    }

}