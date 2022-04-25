package asssert.core.handler;

import asssert.core.feature.ComparableAssert;

public class AnonymousCharacterAssert extends AnonymousObjectAssert implements ComparableAssert<Character> {

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

    @Override
    public void isLessThan(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Character actual, Character start, Character end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }

}
