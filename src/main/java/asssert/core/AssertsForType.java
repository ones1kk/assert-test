package asssert.core;

public class AssertsForType {

    public static AbstractStringAssert<StringAssert, String> assertThat(String actual) {
        return new StringAssert(actual);
    }

}
