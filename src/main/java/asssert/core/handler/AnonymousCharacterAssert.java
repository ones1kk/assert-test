package asssert.core.handler;

import asssert.core.feature.ComparableAssert;

public class AnonymousCharacterAssert extends AnonymousObjectAssert implements
    ComparableAssert<Character> {

    public void isUpperCase(Character actual) {
        boolean result = Character.isUpperCase(actual);
        this.defaultDescription = String.format("%s is not upper case", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isLowerCase(Character actual) {
        boolean result = Character.isLowerCase(actual);
        this.defaultDescription = String.format("%s is not lower case", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isLetter(Character actual) {
        boolean result = Character.isLetter(actual);
        this.defaultDescription = String.format("%s is not letter", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isDigit(Character actual) {
        boolean result = Character.isDigit(actual);
        this.defaultDescription = String.format("%s is not digit", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isWhitespace(Character actual) {
        boolean result = Character.isWhitespace(actual);
        this.defaultDescription = String.format("%s is not whitespace", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    @Override
    public void isLessThan(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not less than %s", actual, expected);
        ;
        if (result != -1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not less than or equal to %s", actual,
            expected);
        ;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not greater than %s", actual, expected);
        ;
        if (result != 1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Character actual, Character expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not greater than or Equal to %s", actual,
            expected);
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Character actual, Character start, Character end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = String.format("%s is not between %s and %s", actual, start,
                end);
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }

}
