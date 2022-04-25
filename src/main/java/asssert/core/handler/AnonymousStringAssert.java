package asssert.core.handler;

import asssert.core.feature.ComparableAssert;

public class AnonymousStringAssert extends AnonymousCharSequenceAssert implements
    ComparableAssert<String> {

    @Override
    public void isLessThan(String actual, String expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(String actual, String expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(String actual, String expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(String actual, String expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(String actual, String start, String end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
