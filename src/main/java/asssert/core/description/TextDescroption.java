package asssert.core.description;

import java.util.function.Supplier;

class TextDescription<SELF> extends Description<SELF> {

    protected Supplier<String> descriptionSupplier;

    public TextDescription(String description, Object... args) {
        super();
    }

    public TextDescription(Supplier<String> descriptionSupplier) {
        String text = descriptionSupplier.get();
        System.out.println("text = " + text);
    }
}
