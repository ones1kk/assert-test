package asssert.core;

import asssert.core.description.Describable;
import asssert.core.description.Description;
import java.util.function.Supplier;

public class AbstractStringAssert<SELF extends AbstractInstanceAssert<SELF, ACTUAL>, ACTUAL> extends
    AbstractInstanceAssert<SELF, ACTUAL> implements Describable<SELF> {

    protected AbstractStringAssert(SELF self, ACTUAL actual) {
        super(self, actual);
    }

    public AbstractStringAssert<SELF, ACTUAL> isEmpty() {
        assert actual.toString().isEmpty();
        return this;
    }

    public AbstractStringAssert<SELF, ACTUAL> isNotEmpty() {
        assert !actual.toString().isEmpty();
        return this;
    }

    @Override
    public SELF as(String description, Object... args) {
        return Describable.super.as(description, args);
    }

    @Override
    public SELF as(Supplier<String> descriptionSupplier) {
        return Describable.super.as(descriptionSupplier);
    }

    @Override
    public SELF describedAs(Description<SELF> description) {
        return null;
    }
}
