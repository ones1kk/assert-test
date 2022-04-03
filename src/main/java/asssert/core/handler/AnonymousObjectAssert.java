package asssert.core.handler;

import java.util.Objects;

public class AnonymousObjectAssert extends AbstractAssert {

    public void isNull(Object actual) {
        boolean result = actual == null;
        if (!result) {
            throw exception;
        }
    }

    public void isNotNull(Object actual) {
        boolean result = actual != null;
        if (!result) {
            throw exception;
        }
    }

    public void isSameAs(Object actual, Object expected) {
        boolean result = actual == expected;
        if (!result) {
            throw exception;
        }
    }

    public void isEqualTo(Object actual, Object expected) {
        boolean result = (Objects.deepEquals(actual, expected));
        if (!result) {
            throw exception;
        }
    }

    public void isNotEqualTo(Object actual, Object expected) {
        boolean result = !(Objects.deepEquals(actual, expected));
        if (!result) {
            throw exception;
        }
    }

    public void isAssignableFrom(Object actual, Class<?> expected) {
        boolean result = actual.getClass().isAssignableFrom(expected);
        if (!result) {
            throw exception;
        }
    }


}
