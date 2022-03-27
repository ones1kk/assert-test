package asssert.core;

public class AbstractStringAssert<SELF extends AbstractInstanceAssert<ACTUAL>, ACTUAL> extends AbstractInstanceAssert<ACTUAL> {

    protected AbstractStringAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
    }

    public AbstractStringAssert<SELF, ACTUAL> isNull() {
        assert actual == null;
        return this;
    }

    public AbstractStringAssert<SELF, ACTUAL> isEmpty() {
        assert actual.toString().isEmpty();
        return this;
    }

    public AbstractStringAssert<SELF, ACTUAL> isNotNull() {
        assert actual != null;
        return this;
    }

    public AbstractStringAssert<SELF, ACTUAL> isNotEmpty() {
        assert !actual.toString().isEmpty();
        return this;
    }
}
