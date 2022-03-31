package asssert.core.handler;

public class CharacterAssert<SELF, ACTUAL> extends Assert<SELF, ACTUAL> {

    public CharacterAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
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

    public SELF isLetter(Character actual) {
        boolean result = Character.isLetter(actual);
        if (!result) {
            throw exception;
        }
        return self;
    }

    public SELF isDigit(Character actual) {
        boolean result = Character.isDigit(actual);
        if (!result) {
            throw exception;
        }
        return self;
    }

    public SELF isWhitespace(Character actual) {
        boolean result = Character.isWhitespace(actual);
        if (!result) {
            throw exception;
        }
        return self;
    }


}
