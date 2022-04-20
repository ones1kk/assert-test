package asssert.core.handler;

import static org.junit.jupiter.api.Assertions.*;

import asssert.Assertion;
import java.util.Comparator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousStringAssertTest {

    @Test
    @DisplayName("AnonymousStringAssert operators")
    void test1() {
        String actual1 = "A";
        String actual2 = "B";
        String actual3 = "C";

        String expected1 = "A";
        String expected2 = "B";
        String expected3 = "C";

        Assertion.assertThat(actual1).isLessThan(expected2);
        Assertion.assertThat(actual2).isGreaterThan(expected1);

        Assertion.assertThat(actual1).isLessThanOrEqualTo(expected1);
        Assertion.assertThat(actual1).isLessThanOrEqualTo(expected2);

        Assertion.assertThat(actual3).isGreaterThanOrEqualTo(expected3);
        Assertion.assertThat(actual3).isGreaterThanOrEqualTo(expected2);

    }

}