package asssert.core.description;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class Description implements Describable {

    @Override
    public String describedAs(Supplier<String> supplier, @Nullable Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    @Override
    public String describedAs(String description, @Nullable Object... args) {
       return getFormattingDescription(description, args);
    }

    private String getFormattingDescription(String description, Object[] args) {
        if (description.contains("{}")) {
            if(args == null) throw new RuntimeException();
            return String.format(description.replace("{}", "%s"), args);
        }else {
            return description;
        }

    }
}
