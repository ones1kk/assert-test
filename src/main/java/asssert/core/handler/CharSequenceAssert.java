package asssert.core.handler;

public class CharSequenceAssert<SELF> extends Assert<SELF> {

    protected CharSequenceAssert(Class<?> self) {
        super(self);
    }

    public SELF isUpperCase(Character actual) {
        boolean result = Character.isUpperCase(actual);
        if (!result) {
            throw exception;
        }
        return self;
    }

    public SELF isLowerCase(Character actual) {
        boolean result = Character.isLowerCase(actual);
        if (!result) {
            throw exception;
        }
        return self;
    }


}
