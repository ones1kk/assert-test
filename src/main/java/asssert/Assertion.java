package asssert;

import asssert.core.AbstractCharacterAssert;
import asssert.core.AbstractIntegerAssert;
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

    public static AbstractIntegerAssert<?, Integer> assertThat(Integer actual) {
        return AssertsForType.assertThat(actual);
    }

    public static AbstractIntegerAssert<?, Integer> assertThat(int actual) {
        return AssertsForType.assertThat(actual);
    }


}
