package asssert.core.description;

import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class Description<SELF> implements Describable<SELF> {

    protected final SELF self;

    public Description(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    @Override
    public void describedAs(Supplier<String> description, @Nullable Object... args) {

    }

    @Override
    public void describedAs(String description, @Nullable Object... args) {

    }
}
