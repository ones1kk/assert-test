package asssert.core.handler;

public class AnonymousCharacterAssert<T> extends AbstractAssert<T> {

    public AnonymousCharacterAssert(Class<T> type) {
        super(type);
    }

    public void isUpperCase(Character actual) {
        boolean result = Character.isUpperCase(actual);
        if (!result) {
            throw exception;
        }
    }

    public void isLowerCase(Character actual) {
        boolean result = Character.isLowerCase(actual);
        if (!result) {
            throw exception;
        }
    }

    public void isLetter(Character actual) {
        boolean result = Character.isLetter(actual);
        if (!result) {
            throw exception;
        }
    }

    public void isDigit(Character actual) {
        boolean result = Character.isDigit(actual);
        if (!result) {
            throw exception;
        }
    }

    public void isWhitespace(Character actual) {
        boolean result = Character.isWhitespace(actual);
        if (!result) {
            throw exception;
        }
    }


}
