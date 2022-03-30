package asssert;

import asssert.core.AbstractStringAssert;
import asssert.core.AssertsForType;

public class Assertion {

    protected Assertion() {
    }

    public static AbstractStringAssert<?> assertThat(String actual) {
        return AssertsForType.assertThat(actual);
    }


}
