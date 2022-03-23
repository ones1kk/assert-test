package asssert.core;

public class AssertsForType {
    public static AbstractStringAssert<?> assertThat(String actual) {
        return new StringAssert(actual);
    }

}
