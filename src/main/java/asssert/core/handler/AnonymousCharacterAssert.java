package asssert.core.handler;

public class AnonymousCharacterAssert extends AbstractAssert {

    public void isUpperCase(Character actual) {
        boolean result = Character.isUpperCase(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

    public void isLowerCase(Character actual) {
        boolean result = Character.isLowerCase(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

    public void isLetter(Character actual) {
        boolean result = Character.isLetter(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

    public void isDigit(Character actual) {
        boolean result = Character.isDigit(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

    public void isWhitespace(Character actual) {
        boolean result = Character.isWhitespace(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

}
