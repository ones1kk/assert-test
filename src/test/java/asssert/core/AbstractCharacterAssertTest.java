package asssert.core;

import asssert.Assertion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractCharacterAssertTest {


    @Test
    @DisplayName("Basic Test")
    void test1() {
        char actual = 'a';

        Assertion.assertThat(actual).isLowerCase();
    }

}