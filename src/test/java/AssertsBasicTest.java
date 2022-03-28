import asssert.Asserts;
import asssert.core.AbstractInstanceAssert;
import asssert.core.AbstractStringAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertsBasicTest {

    @Test
    @DisplayName("Assertions")
    void test1() {
        String str = "hello";
        Assertions.assertThat(str).as("actual was {}", str).isNotNull().isNotEmpty().isNotBlank()
            .isEqualTo("hello");
    }

    @Test
    @DisplayName("Basic Structure")
    void test2() {
        String actual = "hello";

//        Asserts.assertThat(actual).isNotNull().isNotEmpty();
        AbstractStringAssert<?, String> stringAbstractStringAssert = Asserts.assertThat(actual);

    }

    @Test
    @DisplayName("Is this assertion instance of AbstractInstanceAssert?")
    void test3() {
        String actual = "hello";
        AbstractStringAssert<?, String> stringAbstractStringAssert = Asserts.assertThat(actual);

        Assertions.assertThat(stringAbstractStringAssert)
            .isInstanceOf(AbstractInstanceAssert.class);
    }

}


