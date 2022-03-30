package asssert;

import asssert.core.AbstractCharSequenceAssert;
import asssert.core.AbstractStringAssert;
import asssert.core.AssertsForType;

public class Assertion {

    protected Assertion() {
    }

    public static AbstractStringAssert<?> assertThat(String actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractCharSequenceAssert<?, Character> assertThat(Character actual) {
        return AssertsForType.assertThat(actual);
    }


}
