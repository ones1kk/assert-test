package asssert.core;

public class AssertsForType {

    public static <SELF extends AbstractInstanceAssert<SELF, String>> AbstractStringAssert<?, String> assertThat(String actual) {
        return new StringAssert<SELF>(actual);
    }

}
