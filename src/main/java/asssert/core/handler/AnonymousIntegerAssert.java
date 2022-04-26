package asssert.core.handler;

import asssert.core.feature.ComparableAssert;

public class AnonymousIntegerAssert extends AnonymousObjectAssert implements
    ComparableAssert<Integer> {

    public void isPositive(Integer actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is not positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    public void isNegative(Integer actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is not negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    public void isEven(Integer actual) {
        boolean result = (actual & 1) == 0;
        this.defaultDescription = actual + " is not even";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Odd", description));
        }
    }

    public void isOdd(Integer actual) {
        boolean result = (actual & 1) != 0;
        this.defaultDescription = actual + " is not odd";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Even", description));
        }
    }

    @Override
    public void isLessThan(Integer actual, Integer expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Integer actual, Integer expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Integer actual, Integer expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Integer actual, Integer expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Integer actual, Integer start, Integer end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
