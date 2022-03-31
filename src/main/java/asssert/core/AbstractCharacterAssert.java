package asssert.core;

public class AbstractCharacterAssert<SELF extends AbstractCharacterAssert<SELF, ACTUAL>, ACTUAL> extends
    AbstractObjectAssert<SELF, ACTUAL> {

    protected AbstractCharacterAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
    }

    public SELF isUpperCase() {
        return self;
    }

    public SELF isLowerCase() {
        return self;
    }

    public SELF isLetter() {
        return self;
    }

    public SELF isDigit() {
        return self;
    }

    public SELF isWhitespace() {
        return self;
    }
}
