package asssert.core;

import asssert.core.description.Describable;
import asssert.core.description.TextDescription;
import asssert.core.handler.AnonymousObjectAssert;
import asssert.core.handler.AssertFactory;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class AbstractObjectAssert<SELF extends InterfaceAssert<SELF, Object>, ACTUAL> implements
    InterfaceAssert<SELF, Object> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final AssertFactory assertFactory = new AssertFactory();

    protected final Describable describable = new TextDescription();

    protected AnonymousObjectAssert objectAssert;

    protected AbstractObjectAssert(Class<?> self, ACTUAL actual) {
        this.self = (SELF) self.cast(this);
        this.actual = actual;
        this.objectAssert = assertFactory.createAssert(actual);
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

    @Override
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

    public SELF as(Supplier<String> supplier, @Nullable Object... args) {
        this.objectAssert.asDescription = this.describable.describedAs(supplier, args);
        return self;
    }

    public SELF as(String description, @Nullable Object... args) {
        this.objectAssert.asDescription = this.describable.describedAs(description, args);
        return self;
    }

}