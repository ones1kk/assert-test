package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringAbstractAssertTest {

    @Test
    @DisplayName("validate instance inheritance relationship")
    void test1() {
        String actual = "hello";
        AnonymousStringAssert<String> stringAssert = new AnonymousStringAssert(String.class);
        Assertions.assertThat(stringAssert).isInstanceOf(AbstractAssert.class)
            .isInstanceOf(AnonymousCharSequenceAssert.class);
    }

    @Test
    @DisplayName("Success : validate StringAssert methods")
    void test2() {
        String actual1 = "hello";
        String actual2 = "";

        AnonymousStringAssert<String> stringAssert = new AnonymousStringAssert(String.class);
        stringAssert.isNotEmpty(actual1);
        stringAssert.isEmpty(actual2);
    }

    @Test
    @DisplayName("Success : validate StringAssert methods")
    void test3() {
        String actual1 = "";
        String actual2 = "hello";

        AnonymousStringAssert<String> stringAssert = new AnonymousStringAssert(String.class);
        assertThrows(RuntimeException.class, () -> stringAssert.isNotEmpty(actual1));
        assertThrows(RuntimeException.class, () -> stringAssert.isEmpty(actual2));
    }
}