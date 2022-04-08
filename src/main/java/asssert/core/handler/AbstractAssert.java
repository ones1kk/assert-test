package asssert.core.handler;

import java.util.Objects;

public abstract class AbstractAssert implements InterfaceAssert  {

    protected String message;

    protected RuntimeException getException(String message) {
        return new RuntimeException(message);
    }

    @Override
    public void isNull(Object actual) {
        boolean result = actual == null;
        if (!result) {
            this.message  = actual + " is not null";
            throw getException(message);
        }
    }

    @Override
    public void isNotNull(Object actual) {
        boolean result = actual != null;
        if (!result) {
            this.message  = actual + " is null";
            throw getException(message);
        }
    }

    @Override
    public void isSameAs(Object actual, Object expected) {
        boolean result = actual == expected;
        if (!result) {
            this.message  = (actual +  " is not same as " + expected);
            throw getException(message);
        }
    }

    @Override
    public void isEqualTo(Object actual, Object expected) {
        boolean result = (Objects.deepEquals(actual, expected));
        if (!result) {
            this.message  = (actual +  " is not equal to " + expected);
            throw getException(message);
        }
    }

    @Override
    public void isNotEqualTo(Object actual, Object expected) {
        boolean result = !(Objects.deepEquals(actual, expected));
        if (!result) {
            this.message  = (actual +  " is equal to " + expected);
            throw getException(message);
        }
    }

    @Override
    public void isAssignableFrom(Object actual, Class<?> expected) {
        boolean result = actual.getClass().isAssignableFrom(expected);
        if (!result) {
            this.message  = (actual +  " is not assignable from " + expected);
            throw getException(message);
        }
    }

}
