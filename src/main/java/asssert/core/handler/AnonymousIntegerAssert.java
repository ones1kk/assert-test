package asssert.core.handler;

import asssert.Assertion;
import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousIntegerAssert extends AnonymousObjectAssert implements
    ComparableAssert<Integer>, NumberAssert<Integer> {

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
        int result = Integer.compare(actual, expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isPositive(Integer actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is not positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Integer actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Integer actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is not negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Integer actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Integer actual) {
        boolean result = actual == 0;
        this.defaultDescription = actual + " is not zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Integer actual) {
        boolean result = actual != 0;
        this.defaultDescription = actual + " is zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {
        int startResult = Integer.compare(actual, (expected-offset.value));
        int endResult = Integer.compare(actual, (expected+offset.value));

        this.defaultDescription = actual + " is not close to " + expected;
        if(startResult == -1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, (expected-offset.value) + " ~ " + (expected+offset.value), description));
        }
    }

    @Override
    public void isNotCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {
        int startResult = Integer.compare(actual, (expected-offset.value));
        int endResult = Integer.compare(actual, (expected+offset.value));

        this.defaultDescription = actual + " is close to " + expected;
        if(startResult == 1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, (expected-offset.value) + " > " + actual + " or "+ (expected+offset.value) + " < " + actual, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Integer actual, Integer expected) {
        int result = Integer.compare(actual, expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Integer actual, Integer expected) {
        int result = Integer.compare(actual, expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Integer actual, Integer expected) {
        int result = Integer.compare(actual, expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Integer actual, Integer start, Integer end) {
        if ((Integer.compare(actual, start) == -1) || ((
            Integer.compare(actual, end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
