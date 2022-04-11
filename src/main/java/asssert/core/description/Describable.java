package asssert.core.description;

import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface Describable {

    String describedAs(Supplier<String> description, @Nullable Object... args);

    String describedAs(String description, @Nullable Object... args);

}
