package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringAssertTest {

    @Test
    @DisplayName("validate instance inheritance relationship")
    void test1() {
        String actual = "hello";
        StringAssert<?, String> stringAssert = new StringAssert(StringAssert.class, String.class);
        Assertions.assertThat(stringAssert).isInstanceOf(Assert.class)
            .isInstanceOf(CharSequenceAssert.class);
    }

    @Test
    @DisplayName("Success : validate StringAssert methods")
    void test2() {
        String actual1 = "hello";
        String actual2 = "";

        StringAssert<?, String> stringAssert = new StringAssert(StringAssert.class, String.class);
        stringAssert.isNotEmpty(actual1);
        stringAssert.isEmpty(actual2);
    }

    @Test
    @DisplayName("Success : validate StringAssert methods")
    void test3() {
        String actual1 = "";
        String actual2 = "hello";

        StringAssert<?, String> stringAssert = new StringAssert(StringAssert.class, String.class);
        assertThrows(RuntimeException.class, () -> stringAssert.isNotEmpty(actual1));
        assertThrows(RuntimeException.class, () -> stringAssert.isEmpty(actual2));
    }
}