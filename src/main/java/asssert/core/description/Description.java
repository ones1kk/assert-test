package asssert.core.description;

import java.util.function.Supplier;

public abstract class Description<SELF> implements Describable<SELF> {

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
