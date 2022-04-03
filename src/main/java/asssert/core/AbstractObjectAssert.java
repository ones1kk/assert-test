package asssert.core;

import asssert.core.handler.AnonymousObjectAssert;

public abstract class AbstractObjectAssert<SELF, ACTUAL> implements
    InterfaceObjectAssert<SELF, Object> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final AnonymousObjectAssert objectAssert = new AnonymousObjectAssert();

    protected AbstractObjectAssert(Class<?> self, ACTUAL actual) {
        this.self = (SELF) self.cast(this);
        this.actual = actual;
    }

    @Override
    public SELF isNull() {
        this.objectAssert.isNull(actual);
        return self;
    }

    @Override
    public SELF isNotNull() {
        this.objectAssert.isNotNull(actual);
        return self;
    }

    public SELF isSameAs(Object expected) {
        this.objectAssert.isSameAs(actual, expected);
        return self;
    }

    @Override
    public SELF isEqualTo(Object expected) {
        this.objectAssert.isEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isNotEqualTo(Object expected) {
        this.objectAssert.isNotEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAssignableFrom(Class<?> expected) {
        this.objectAssert.isAssignableFrom(actual, expected);
        return self;
    }

}