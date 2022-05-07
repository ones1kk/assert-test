package asssert.core.handler;

import asssert.core.description.TextDescription;
import asssert.core.exception.AssertException;

public abstract class AnonymousAbstractAssert extends TextDescription implements InterfaceAssert {

    public String asDescription;

    protected String defaultDescription;

    protected AssertException getException(String message) {
        return new AssertException(message);
    }

    public String setDescription() {
        return this.asDescription != null ? this.asDescription
            : this.defaultDescription;
    }

}
