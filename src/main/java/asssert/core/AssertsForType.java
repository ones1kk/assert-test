package asssert.core;

public class AssertsForType {

    public static AbstractStringAssert<String> assertThat(String actual) {
        return new StringAssert(actual);
    }

}
