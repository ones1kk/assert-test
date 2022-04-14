package asssert.core.handler;

import asssert.core.description.TextDescription;
import asssert.core.exception.AssertException;
import java.util.Objects;

public abstract class AbstractAssert extends TextDescription implements InterfaceAssert {

    public String asDescription;

    protected String defaultDescription;

    protected AssertException getException(String message) {
        AssertException assertException = new AssertException(message);
        assertException.setStackTrace(new StackTraceElement[]{});
        return assertException;
    }

    public String setDescription() {
        return asDescription != null ? asDescription : defaultDescription;
    }

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
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isEqualTo(Object actual, Object expected) {
        boolean result = (Objects.deepEquals(actual, expected));
        this.defaultDescription = (actual + " is not equal to " + expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
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
            throw getException(setDefaultText(actual, expected, description));
        }
    }

}
