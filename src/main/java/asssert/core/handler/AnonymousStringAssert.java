package asssert.core.handler;

import asssert.core.feature.ComparableAssert;

public class AnonymousStringAssert extends AnonymousCharSequenceAssert implements
    ComparableAssert<String> {

    @Override
    public void isLessThan(String actual, String expected) {
        int result = actual.compareTo(expected);
      this.defaultDescription = String.format("%s is not less than %s", actual, expected);
        if (result != -1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(String actual, String expected) {
        int result = actual.compareTo(expected);
       this.defaultDescription = String.format("%s is not less than or equal to %s", actual, expected);;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(String actual, String expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not greater than %s", actual, expected);;
        if (result != 1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(String actual, String expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not greater than or Equal to %s", actual, expected);
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(String actual, String start, String end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = String.format("%s is not between %s and %s", actual, start, end);
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
