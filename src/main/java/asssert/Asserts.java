package asssert;

import asssert.core.AbstractStringAssert;
import asssert.core.AssertsForType;
import asssert.core.StringAssert;

public class Asserts {

    protected Asserts() {
    }

    public static AbstractStringAssert<StringAssert, String> assertThat(String actual) {
        return AssertsForType.assertThat(actual);
    }


}
