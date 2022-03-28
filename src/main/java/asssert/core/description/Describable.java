package asssert.core.description;

import java.util.function.Supplier;

public interface Describable<SELF> {

    default SELF as(String description, Object... args) {
        return describedAs(new TextDescription<SELF>(description, args));
    }

    default SELF as(Supplier<String> descriptionSupplier) {
        return describedAs(new TextDescription<SELF>(descriptionSupplier));
    }

    SELF describedAs(Description<SELF> description);

}
