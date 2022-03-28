package asssert.core;

import java.util.Objects;
import org.apache.commons.lang3.ClassUtils;

public abstract class AbstractInstanceAssert<SELF, ACTUAL> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected AbstractInstanceAssert(SELF self, ACTUAL actual) {
        this.actual = actual;
        this.self = self;
        System.out.println("self = " + self);
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