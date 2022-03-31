package asssert;

import asssert.core.AbstractCharacterAssert;
import asssert.core.AbstractStringAssert;
import asssert.core.AssertsForType;

public class Assertion {

    protected Assertion() {
    }

    public static AbstractStringAssert<?> assertThat(String actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractCharacterAssert<?, Character> assertThat(Character actual) {
        return AssertsForType.assertThat(actual);
    }


}
