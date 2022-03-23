package asssert;

import asssert.core.AbstractStringAssert;
import asssert.core.AssertsForType;

public class Asserts{

    protected Asserts() {}

    public static AbstractStringAssert<?> assertThat(String actual) {
        return AssertsForType.assertThat(actual);
    }



}
