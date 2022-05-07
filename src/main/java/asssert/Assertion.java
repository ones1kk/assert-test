package asssert;

import asssert.core.AbstractByteAssert;
import asssert.core.AbstractCharacterAssert;
import asssert.core.AbstractDoubleAssert;
import asssert.core.AbstractFloatAssert;
import asssert.core.AbstractIntegerAssert;
import asssert.core.AbstractLongAssert;
import asssert.core.AbstractNumberArrayAssert;
import asssert.core.AbstractObjectAssert;
import asssert.core.AbstractShortAssert;
import asssert.core.AbstractStringAssert;
import asssert.core.AssertsForType;

public final class Assertion {

    private Assertion() {
    }

    public static AbstractObjectAssert<?, Object> assertThat(Object actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractStringAssert<?> assertThat(String actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractCharacterAssert<?, Character> assertThat(Character actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractCharacterAssert<?, Character> assertThat(char actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractIntegerAssert<?, Integer> assertThat(Integer actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractIntegerAssert<?, Integer> assertThat(int actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractDoubleAssert<?, Double> assertThat(Double actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractDoubleAssert<?, Double> assertThat(double actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractFloatAssert<?, Float> assertThat(Float actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractFloatAssert<?, Float> assertThat(float actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractLongAssert<?, Long> assertThat(Long actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractLongAssert<?, Long> assertThat(long actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractByteAssert<?, Byte> assertThat(Byte actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractByteAssert<?, Byte> assertThat(byte actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractShortAssert<?, Short> assertThat(Short actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractShortAssert<?, Short> assertThat(short actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractNumberArrayAssert<?, Number[]> assertThat(Number[] actual) {
        return AssertsForType.assertThat(actual);
    }

}
