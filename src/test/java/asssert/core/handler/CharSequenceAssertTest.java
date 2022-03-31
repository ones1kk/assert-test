package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharSequenceAssertTest {


    @Test
    @DisplayName("validate instance inheritance relationship")
    void test1() {
        CharSequenceAssert<?> characterAssert = new CharSequenceAssert<>(CharSequenceAssert.class);
        Assertions.assertThat(characterAssert).isInstanceOf(Assert.class).isInstanceOf(Assert.class);
    }

    @Test
    @DisplayName("Success : validate CharSequenceAssert methods")
    void test2() {
        char actual1 = 'A';
        char actual2 = 'a';
        CharSequenceAssert<?> characterAssert = new CharSequenceAssert<>(CharSequenceAssert.class);
        characterAssert.isUpperCase(actual1);
        characterAssert.isLowerCase(actual2);

    }

    @Test
    @DisplayName("Fail : validate CharSequenceAssert methods")
    void test3() {
        char actual1 = 'a';
        char actual2 = 'A';
        CharSequenceAssert<?> characterAssert = new CharSequenceAssert<>(CharSequenceAssert.class);

        assertThrows( RuntimeException.class, () -> characterAssert.isUpperCase(actual1));
        assertThrows( RuntimeException.class, () -> characterAssert.isLowerCase(actual2));

    }

}