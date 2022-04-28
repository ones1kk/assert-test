package asssert.core.handler;

import java.util.Objects;

public class AnonymousObjectAssert extends AbstractAssert {

    @Override
    public void isNull(Object actual) {
        boolean result = actual == null;
        this.defaultDescription = actual + " is not null";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    @Override
    public void isNotNull(Object actual) {
        boolean result = actual != null;
        this.defaultDescription = actual + " is null";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    @Override
    public void isSameAs(Object actual, Object expected) {
        boolean result = actual == expected;
        this.defaultDescription = (actual + " is not same as " + expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(expected, actual, description));
        }
    }

    @Override
    public void isEqualTo(Object actual, Object expected) {
        boolean result = (Objects.deepEquals(actual, expected));
        this.defaultDescription = (actual + " is not equal to " + expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(expected, actual, description));
        }
    }

    @Override
    public void isNotEqualTo(Object actual, Object expected) {
        boolean result = !(Objects.deepEquals(actual, expected));
        this.defaultDescription = (actual + " is equal to " + expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isAssignableFrom(Object actual, Class<?> expected) {
        boolean result = actual.getClass().isAssignableFrom(expected);
        this.defaultDescription = (actual + " is not assignable from " + expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual.getClass(), expected, description));
        }
    }


}
