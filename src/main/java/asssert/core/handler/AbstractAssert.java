package asssert.core.handler;

public abstract class AbstractAssert<T> {

    protected final T type;

    protected final RuntimeException exception = new RuntimeException();

    protected AbstractAssert(Class<?> type) {
        this.type = (T) type.cast(this);

    }
}
