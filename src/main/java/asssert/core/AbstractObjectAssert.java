package asssert.core;

import java.util.Objects;

public abstract class AbstractObjectAssert<SELF, ACTUAL> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected AbstractObjectAssert(Class<?> self, ACTUAL actual) {
        this.self = (SELF) self.cast(this);
        this.actual = actual;
    }

    public SELF isNull() {
        assert actual == null;
        return self;
    }

    public SELF isNotNull() {
        assert actual != null;
        return self;
    }

    public SELF isSameAs(ACTUAL expected) {
        assert actual == expected;
        return self;
    }

    public SELF isEqualTo(ACTUAL expected) {
        assert (Objects.deepEquals(actual, expected));
        return self;
    }

    public SELF isNotEqualTo(ACTUAL expected) {
        assert !(Objects.deepEquals(actual, expected));
        return self;
    }

    public SELF isInstanceOf(Class<?> expected) {
        assert actual.getClass().isAssignableFrom(expected);
        return self;
    }


}