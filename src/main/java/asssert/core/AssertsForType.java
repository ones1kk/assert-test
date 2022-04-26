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

}
