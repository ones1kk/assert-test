package asssert.core.handler;

import asssert.core.description.Describable;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class AbstractAssert implements InterfaceAssert{

    protected final RuntimeException exception = new RuntimeException();

    @Override
    public void isNull(Object actual) {
        boolean result = actual == null;
        if (!result) {
            throw exception;
        }
    }
    @Override
    public void isNotNull(Object actual) {
        boolean result = actual != null;
        if (!result) {
            throw exception;
        }
    }
    @Override
    public void isSameAs(Object actual, Object expected) {
        boolean result = actual == expected;
        if (!result) {
            throw exception;
        }
    }
    @Override
    public void isEqualTo(Object actual, Object expected) {
        boolean result = (Objects.deepEquals(actual, expected));
        if (!result) {
            throw exception;
        }
    }
    @Override
    public void isNotEqualTo(Object actual, Object expected) {
        boolean result = !(Objects.deepEquals(actual, expected));
        if (!result) {
            throw exception;
        }
    }
    @Override
    public void isAssignableFrom(Object actual, Class<?> expected) {
        boolean result = actual.getClass().isAssignableFrom(expected);
        if (!result) {
            throw exception;
        }
    }
}
