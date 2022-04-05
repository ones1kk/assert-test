package asssert.core.description;

import static org.junit.jupiter.api.Assertions.*;

import asssert.Assertion;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DescriptionTest {

    @Test
    @DisplayName("Basic Feature Test(prototype)")
    void test1() {
        String actual = "hello";
        List<String> argumentList = Arrays.asList("hello", "world", "bye", "world");

        Assertion.assertThat(actual).as(()-> "hello world").isSameAs("hello").isNotNull().isNotEmpty();
        Assertion.assertThat(actual).as(()-> "hello world {} {} {}", "!", 1, argumentList);
        Assertion.assertThat(actual).as("hello world");
        Assertion.assertThat(actual).as("hello world {} {}", "?", 2);

    }

}