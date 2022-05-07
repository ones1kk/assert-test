package asssert.core.feature;

import asssert.core.exception.AssertException;
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
        Offset<Short> shortOffset = Offset.offset((short) 1);
        Offset<Byte> byteOffset = Offset.offset((byte) 1);

        Assertions.assertThat(integerOffset.value).isNotNull().isEqualTo(1);
        Assertions.assertThat(doubleOffset.value).isNotNull().isEqualTo(1.1);
        Assertions.assertThat(floatOffset.value).isNotNull().isEqualTo(1.1f);
        Assertions.assertThat(longOffset.value).isNotNull().isEqualTo(1L);
        Assertions.assertThat(shortOffset.value).isNotNull().isEqualTo((short) 1);
        Assertions.assertThat(byteOffset.value).isNotNull().isEqualTo((byte) 1);

        // if construct argument of Offset.class is null
        org.junit.jupiter.api.Assertions.assertThrows(AssertException.class,
            () -> Offset.offset(null));

    }

}