package asssert.core.description;

import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface Describable<SELF> {

    void describedAs(Supplier<String> description, @Nullable Object... args);

    void describedAs(String description, @Nullable Object... args);

}
