package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharacterAssertTest {

    @Test
    @DisplayName("validate instance inheritance relationship")
    void test1() {
        CharacterAssert<?, Character> characterAssert = new CharacterAssert(CharacterAssert.class, Character.class);
        Assertions.assertThat(characterAssert).isInstanceOf(Assert.class).isInstanceOf(CharacterAssert.class);
    }

    @Test
    @DisplayName("Success : validate CharacterAssert methods")
    void test2() {
        char actual1 = 'A';
        char actual2 = 'a';
        char actual3 = 'a';
        char actual4 = '1';
        char actual5 = ' ';

        CharacterAssert<?, Character> characterAssert = new CharacterAssert(CharacterAssert.class, Character.class);

        characterAssert.isUpperCase(actual1);
        characterAssert.isLowerCase(actual2);
        characterAssert.isLetter(actual3);
        characterAssert.isDigit(actual4);
        characterAssert.isWhitespace(actual5);

    }

    @Test
    @DisplayName("Fail : validate CharacterAssert methods")
    void test3() {
        char actual1 = 'a';
        char actual2 = 'A';
        char actual3 = '1';
        char actual4 = 'a';
        char actual5 = 'a';

        CharacterAssert<?, Character> characterAssert = new CharacterAssert(CharacterAssert.class, Character.class);

        assertThrows( RuntimeException.class, () -> characterAssert.isUpperCase(actual1));
        assertThrows( RuntimeException.class, () -> characterAssert.isLowerCase(actual2));
        assertThrows( RuntimeException.class, () -> characterAssert.isLetter(actual3));
        assertThrows( RuntimeException.class, () -> characterAssert.isDigit(actual4));
        assertThrows( RuntimeException.class, () -> characterAssert.isWhitespace(actual5));

    }

}