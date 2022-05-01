package asssert.core;

public class AssertsForType {

    public static AbstractStringAssert<?> assertThat(String actual) {
        return new StringAssert(actual);
    }

    public static AbstractCharacterAssert<?, Character> assertThat(Character actual) {
        return new CharacterAssert(CharacterAssert.class, actual);
    }

    public static AbstractCharacterAssert<?, Character> assertThat(char actual) {
        return new CharacterAssert(CharacterAssert.class, actual);
    }

    public static AbstractIntegerAssert<?, Integer> assertThat(Integer actual) {
        return new IntegerAssert(IntegerAssert.class, actual);
    }

    public static AbstractIntegerAssert<?, Integer> assertThat(int actual) {
        return new IntegerAssert(IntegerAssert.class, actual);
    }

    public static AbstractDoubleAssert<?, Double> assertThat(Double actual) {
        return new DoubleAssert(DoubleAssert.class, actual);
    }

    public static AbstractDoubleAssert<?, Double> assertThat(double actual) {
        return new DoubleAssert(DoubleAssert.class, actual);
    }

    public static AbstractFloatAssert<?, Float> assertThat(Float actual) {
        return new FloatAssert(FloatAssert.class, actual);
    }

    public static AbstractFloatAssert<?, Float> assertThat(float actual) {
        return new FloatAssert(FloatAssert.class, actual);
    }

    public static AbstractLongAssert<?, Long> assertThat(Long actual) {
        return new LongAssert(LongAssert.class, actual);
    }

    public static AbstractLongAssert<?, Long> assertThat(long actual) {
        return new LongAssert(LongAssert.class, actual);
    }

    public static AbstractByteAssert<?, Byte> assertThat(Byte actual) {
        return new ByteAssert(ByteAssert.class, actual);
    }

    public static AbstractByteAssert<?, Byte> assertThat(byte actual) {
        return new ByteAssert(ByteAssert.class, actual);
    }

    public static AbstractShortAssert<?, Short> assertThat(Short actual) {
        return new ShortAssert(ShortAssert.class, actual);
    }

    public static AbstractShortAssert<?, Short> assertThat(short actual) {
        return new ShortAssert(ShortAssert.class, actual);
    }

}
