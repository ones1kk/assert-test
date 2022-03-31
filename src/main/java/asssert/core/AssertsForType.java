package asssert.core;

public class AssertsForType {

    public static AbstractStringAssert<?> assertThat(String actual) {
        return new StringAssert(actual);
    }

    public static AbstractCharacterAssert<?, Character> assertThat(Character actual) {
        return new CharacterAssert(CharacterAssert.class, actual);
    }

}
