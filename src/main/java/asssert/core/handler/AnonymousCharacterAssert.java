package asssert.core.handler;

public class AnonymousCharacterAssert extends AnonymousObjectAssert {

    public void isUpperCase(Character actual) {
        boolean result = Character.isUpperCase(actual);
        this.defaultDescription = actual + " is not upper case";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isLowerCase(Character actual) {
        boolean result = Character.isLowerCase(actual);
        this.defaultDescription = actual + " is not lower case";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isLetter(Character actual) {
        boolean result = Character.isLetter(actual);
        this.defaultDescription = actual + " is not letter";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isDigit(Character actual) {
        boolean result = Character.isDigit(actual);
        this.defaultDescription = actual + " is not digit";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isWhitespace(Character actual) {
        boolean result = Character.isWhitespace(actual);
        this.defaultDescription = actual + " is not whitespace";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

}
