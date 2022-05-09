package asssert.core.handler;

import java.util.Objects;

public class AnonymousObjectAssert extends AnonymousAbstractAssert {

    @Override
    public void isNull(Object actual) {
        boolean result = actual == null;
        this.defaultDescription = String.format("%s is not null", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    @Override
    public void isNotNull(Object actual) {
        boolean result = actual != null;
        this.defaultDescription = String.format("%s is null", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    @Override
    public void isSameAs(Object actual, Object expected) {
        boolean result = actual == expected;
        this.defaultDescription = String.format("%s is not same as %s", actual, expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(expected, actual, description));
        }
    }

    @Override
    public void isEqualTo(Object actual, Object expected) {
        boolean result = (Objects.deepEquals(actual, expected));
        this.defaultDescription = String.format("%s is not equal %s", actual, expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(expected, actual, description));
        }
    }

    @Override
    public void isNotEqualTo(Object actual, Object expected) {
        boolean result = !(Objects.deepEquals(actual, expected));
        this.defaultDescription = String.format("%s is equal to %s", actual, expected);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isAssignableFrom(Object actual, Class<?> expected) {
        boolean result = actual.getClass().isAssignableFrom(expected);
        this.defaultDescription = String.format("%s is not assignable from %s", actual, expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual.getClass(), expected, description));
        }
    }

}
