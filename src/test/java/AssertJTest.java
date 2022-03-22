import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertJTest {

    @Test
    @DisplayName("Assertions")
    void test1() {
        String str = "hello";
        Assertions.assertThat(str).isNotNull().isNotEmpty().isNotBlank().isEqualTo("hello");
    }

}
