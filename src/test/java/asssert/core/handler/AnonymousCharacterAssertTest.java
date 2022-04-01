package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousCharacterAssertTest {

    @Test
    @DisplayName("validate instance inheritance relationship")
    void test1() {
        AnonymousCharacterAssert<Character> anonymousCharacterAssert = new AnonymousCharacterAssert(Character.class);
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

        AnonymousCharacterAssert<Character> anonymousCharacterAssert = new AnonymousCharacterAssert(Character.class);

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

        AnonymousCharacterAssert<Character> anonymousCharacterAssert = new AnonymousCharacterAssert(Character.class);

        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isUpperCase(actual1));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isLowerCase(actual2));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isLetter(actual3));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isDigit(actual4));
        assertThrows(RuntimeException.class, () -> anonymousCharacterAssert.isWhitespace(actual5));

    }

}