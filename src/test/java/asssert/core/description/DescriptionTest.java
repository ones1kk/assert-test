package asssert.core.description;

import static org.assertj.core.api.Assertions.assertThat;

import asssert.Assertion;
import asssert.core.exception.AssertException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DescriptionTest {

    @Test
    @DisplayName("Basic Feature Test(prototype)")
    void test1() {
        String actual = null;

        Assertions.assertThrows(IllegalArgumentException.class,
            () -> Assertion.assertThat(actual).as(() -> "hello it's kind of {}"));

        Assertions.assertThrows(RuntimeException.class,
            () -> Assertion.assertThat(actual).as(() -> "hello it's kind of {}", "test")
                .isNotNull());

        String message = Assertions.assertThrows(RuntimeException.class,
            () -> Assertion.assertThat(actual).as(() -> "hello it's kind of {}", "test")
                .isNotNull()).getMessage();

        System.out.println(message);

    }

    @Test
    @DisplayName("Can replace description of exception?")
    void test2() {
        String actual = "hello";

        String message = Assertions.assertThrows(RuntimeException.class,
            () -> Assertion.assertThat(actual).isNull()).getMessage();

        //        assertThat(message).isEqualTo("hello is not null");
        System.out.println(message);

        String asDescription = Assertions.assertThrows(RuntimeException.class,
            () -> Assertion.assertThat(actual).as("this is as {}", "description").isNull()
        ).getMessage();

        //        assertThat(asDescription).isEqualTo("this is as description ");
        System.out.println(asDescription);

    }

    @Test
    @DisplayName("Text description Test")
    void test3() {
        String actual = "hello";
        Assertions.assertThrows(AssertException.class, () -> Assertion.assertThat(actual).isNull());

    }

}