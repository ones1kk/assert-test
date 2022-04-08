package asssert.core.description;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class Description<SELF> implements Describable<SELF> {

    protected final SELF self;

    public Description(Class<?> self) {
        System.out.println("Description.Description");
        this.self = (SELF) self.cast(this);
    }

    @Override
    public void describedAs(Supplier<String> supplier, @Nullable Object... args) {
        String description = supplier.get().replace("{}", "%s");
        String result = String.format(description, args);

        System.out.println(result);
    }

    @Override
    public void describedAs(String description, @Nullable Object... args) {
        String result = String.format(description.replace("{}", "%s"), args);
        System.out.println("result = " + result);
    }
}
