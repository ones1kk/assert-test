package asssert.core.handler;

import asssert.core.AbstractNumberArrayAssertTest;
import asssert.core.exception.AssertException;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Other Number type test is already completed in AbstractNumberArrayAssertTest.Class
 *
 * @see AbstractNumberArrayAssertTest
 */
class AnonymousNumberArrayAssertTest {

    @Test
    @DisplayName("AnonymousNumberArrayAssert methods(success)")
    void test1() {
        Integer[] actual1 = {1, 2, 3};
        Integer[] actual2 = new Integer[0];
        Integer[] actual3 = new Integer[]{null, 2, 3, 4};

        AnonymousNumberArrayAssert numberArrayAssert = new AnonymousNumberArrayAssert();
        numberArrayAssert.isEmpty(actual2);
        numberArrayAssert.isNotEmpty(actual1);
        numberArrayAssert.isNullOrEmpty(actual2);
        numberArrayAssert.contains(actual1, 2);
        numberArrayAssert.doesNotContain(actual1, 5);
        numberArrayAssert.containsAll(actual1, 1, 2);
        numberArrayAssert.containsAny(actual1, 3, 4, 5);
        numberArrayAssert.containsAny(actual1, 3, 4, 5);
        numberArrayAssert.containsNull(actual3);
        numberArrayAssert.doesNotContainNull(actual1);
        numberArrayAssert.allMatch(actual1, it -> Arrays.equals(it, actual1));
        numberArrayAssert.noneMatch(actual1, it -> Arrays.equals(it, actual2));

    }

    @Test
    @DisplayName("AnonymousNumberArrayAssert methods(fail)")
    void test2() {
        Integer[] actual1 = {1, 2, 3};
        Integer[] actual2 = new Integer[0];
        Integer[] actual3 = new Integer[]{null, 2, 3, 4};

        AnonymousNumberArrayAssert numberArrayAssert = new AnonymousNumberArrayAssert();

        Assertions.assertThrows(AssertException.class, () -> numberArrayAssert.isEmpty(actual1));
        Assertions.assertThrows(AssertException.class, () -> numberArrayAssert.isNotEmpty(actual2));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.isNullOrEmpty(actual1));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.contains(actual1, 5));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.doesNotContain(actual1, 1));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.containsAll(actual1, 4, 5));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.containsAny(actual1, 4, 5));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.containsNull(actual1));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.doesNotContainNull(actual3));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.allMatch(actual1, it -> Arrays.equals(it, actual3)));
        Assertions.assertThrows(AssertException.class,
            () -> numberArrayAssert.noneMatch(actual1, it -> Arrays.equals(it, actual1)));

    }

    @Test
    @DisplayName("NumberArray methods test(success)")
    void test3() {
        Integer[] actual1 = {1, 2, 3};

        AnonymousNumberArrayAssert numberArrayAssert = new AnonymousNumberArrayAssert();
        numberArrayAssert.isMax(actual1 , 3);
        numberArrayAssert.isMin(actual1 , 1);
        numberArrayAssert.isSum(actual1, 6);

        Double[] actual2 = {1.1, 2.2, 3.3};
        numberArrayAssert.isMax(actual2, 3.3);
        numberArrayAssert.isMin(actual2, 1.1);
        numberArrayAssert.isSum(actual2, 6.6);
    }
}