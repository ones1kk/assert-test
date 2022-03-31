import asssert.Assertion;
import asssert.core.CharacterAssert;
import asssert.core.StringAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertsBasicTest {

    @Test
    @DisplayName("Basic Structure")
    void test1() {
        String actual = "hello";
        Assertions.assertThat(Assertion.assertThat(actual).isNotNull().isNotEmpty())
            .isExactlyInstanceOf(StringAssert.class);

        char actual1 = 'h';
        Assertions.assertThat(Assertion.assertThat(actual1).isUpperCase()).isExactlyInstanceOf(
            CharacterAssert.class);
    }


}


