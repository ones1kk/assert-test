package asssert.core;

public class AbstractStringAssert<ACTUAL> extends AbstractInstanceAssert<ACTUAL> {

    protected AbstractStringAssert(ACTUAL actual) {
        this.actual = actual;
        System.out.println("AbstractStringAssert.AbstractStringAssert = " + actual);
    }

    protected AbstractStringAssert() {

    }

    public AbstractStringAssert<ACTUAL> isNull() {
        assert actual == null;
        return this;
    }

    public AbstractStringAssert<ACTUAL> isEmpty() {
        assert actual.toString().isEmpty();
        return this;
    }

    public AbstractStringAssert<ACTUAL> isNotNull() {
        assert actual != null;
        return this;
    }

    public AbstractStringAssert<ACTUAL> isNotEmpty() {
        assert !actual.toString().isEmpty();
        return this;
    }
}
