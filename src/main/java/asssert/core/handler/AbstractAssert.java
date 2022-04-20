package asssert.core.handler;

import asssert.core.description.TextDescription;
import asssert.core.exception.AssertException;
import java.util.Objects;

public abstract class AbstractAssert extends TextDescription implements InterfaceAssert {

    public String asDescription;

    protected String defaultDescription;

    protected AssertException getException(String message) {
        AssertException assertException = new AssertException(message);
        assertException.setStackTrace(new StackTraceElement[]{});
        return assertException;
    }

    public String setDescription() {
        return this.asDescription != null ? this.asDescription
            : this.defaultDescription;
    }

    @Override
    public void isNull(Object actual) {
        boolean result = actual == null;
        this.defaultDescription = actual + " is not null";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }


}
