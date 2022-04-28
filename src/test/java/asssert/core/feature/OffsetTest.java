package asssert.core.feature;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OffsetTest {

    @Test
    @DisplayName("Basic Test")
    void test1() {
        Offset<Integer> integerOffset = Offset.offset(1);
        Offset<Double> doubleOffset = Offset.offset(1.1);
        Offset<Float> floatOffset = Offset.offset(1.1f);
        Offset<Long> longOffset = Offset.offset(1L);

        Assertions.assertThat(integerOffset.value).isNotNull().isEqualTo(1);
        Assertions.assertThat(doubleOffset.value).isNotNull().isEqualTo(1.1);
        Assertions.assertThat(floatOffset.value).isNotNull().isEqualTo(1.1f);
        Assertions.assertThat(longOffset.value).isNotNull().isEqualTo(1L);

    }

}