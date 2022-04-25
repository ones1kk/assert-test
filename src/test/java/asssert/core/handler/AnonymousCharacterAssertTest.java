package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import asssert.core.exception.AssertException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousCharacterAssertTest {

    @Test
    @DisplayName("validate instance inheritance relationship")
    void test1() {
        AnonymousCharacterAssert anonymousCharacterAssert = new AnonymousCharacterAssert();
        Assertions.assertThat(anonymousCharacterAssert).isInstanceOf(AbstractAssert.class)
            .isInstanceOf(AnonymousCharacterAssert.class);
    }

    @Test
    @DisplayName("Success : validate CharacterAssert methods")
    void test2() {
        char actual1 = 'A';
        char actual2 = 'a';
        char actual3 = 'a';
        char actual4 = '1';
        char actual5 = ' ';

        AnonymousCharacterAssert anonymousCharacterAssert = new AnonymousCharacterAssert();

        anonymousCharacterAssert.isUpperCase(actual1);
        anonymousCharacterAssert.isLowerCase(actual2);
        anonymousCharacterAssert.isLetter(actual3);
        anonymousCharacterAssert.isDigit(actual4);
        anonymousCharacterAssert.isWhitespace(actual5);

    }

    @Test
    @DisplayName("Fail : validate CharacterAssert methods")
    void test3() {
        char actual1 = 'a';
        char actual2 = 'A';
        char actual3 = '1';
        char actual4 = 'a';
        char actual5 = 'a';

        AnonymousCharacterAssert anonymousCharacterAssert = new AnonymousCharacterAssert();

        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isUpperCase(actual1));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isLowerCase(actual2));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isLetter(actual3));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isDigit(actual4));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isWhitespace(actual5));

    }

    @Test
    @DisplayName("AnonymousCharacterAssert operators(success)")
    void test4() {
        char actual1 = 'A';
        char actual2 = 'B';
        char actual3 = 'C';

        char expected1 = 'A';
        char expected2 = 'B';
        char expected3 = 'C';

        AnonymousCharacterAssert characterAssert = new AnonymousCharacterAssert();

        // actual < expected
        characterAssert.isLessThan(actual1, expected2);
        // actual > expected
        characterAssert.isGreaterThan(actual2, expected1);

        // actual == expected
        characterAssert.isLessThanOrEqualTo(actual1, expected1);
        // actual < expected
        characterAssert.isLessThanOrEqualTo(actual1, expected2);

        // actual == expected
        characterAssert.isGreaterThanOrEqualTo(actual3, expected3);
        // actual >= expected
        characterAssert.isGreaterThanOrEqualTo(actual3, expected2);

        // start < actual < end
        characterAssert.isBetween(actual2, expected1, expected3);

    }

    @Test
    @DisplayName("AnonymousCharacterAssert operators(fail)")
    void test5() {
        char actual1 = 'A';
        char actual2 = 'B';
        char actual3 = 'C';

        char expected1 = 'A';
        char expected2 = 'B';
        char expected3 = 'C';

        AnonymousCharacterAssert characterAssert = new AnonymousCharacterAssert();

        // actual > expected
        assertThrows(AssertException.class,
            () -> characterAssert.isLessThan(actual2, expected1));
        // actual == expected
        assertThrows(AssertException.class,
            () -> characterAssert.isLessThan(actual2, expected2));

        // actual < expected
        assertThrows(AssertException.class,
            () -> characterAssert.isGreaterThan(actual1, expected2));
        // actual == expected
        assertThrows(AssertException.class,
            () -> characterAssert.isGreaterThan(actual1, expected1));

        // actual > expected
        assertThrows(AssertException.class,
            () -> characterAssert.isLessThanOrEqualTo(actual2, expected1));

        // actual < expected
        assertThrows(AssertException.class,
            () -> characterAssert.isGreaterThanOrEqualTo(actual2, expected3));

        // actual < start
        assertThrows(AssertException.class,
            () -> characterAssert.isBetween(actual1, expected2, expected3));
        // actual > end
        assertThrows(AssertException.class,
            () -> characterAssert.isBetween(actual3, expected1, expected2));
    }

}