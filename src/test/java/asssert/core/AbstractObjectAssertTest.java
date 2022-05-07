package asssert.core;

import asssert.Assertion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractObjectAssertTest {

    @Test
    @DisplayName("Basic Test")
    void test1() {
        String actual = "hello";
        String expected = "hello";
        Assertion.assertThat(actual).isNotNull().isNotEmpty().isSameAs(expected)
            .isAssignableFrom(String.class);

        Assertion.assertThat(new Object()).as("aa").isNotNull();
    }

}