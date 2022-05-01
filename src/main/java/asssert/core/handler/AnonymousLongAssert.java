package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousLongAssert extends AnonymousObjectAssert implements
    ComparableAssert<Long>, NumberAssert<Long> {

    public void isEven(Long actual) {
        boolean result = (actual & 1) == 0;
        this.defaultDescription = actual + " is not even";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Odd", description));
        }
    }

    public void isOdd(Long actual) {
        boolean result = (actual & 1) != 0;
        this.defaultDescription = actual + " is not odd";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Even", description));
        }
    }

    @Override
    public void isLessThan(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isPositive(Long actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is not positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Long actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Long actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is not negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Long actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Long actual) {
        boolean result = actual == 0;
        this.defaultDescription = actual + " is not zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Long actual) {
        boolean result = actual != 0;
        this.defaultDescription = actual + " is zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Long actual, Long expected, Offset<Long> offset) {
        int startResult = Long.compare(actual, (expected - offset.value));
        int endResult = Long.compare(actual, (expected + offset.value));

        this.defaultDescription = actual + " is not close to " + expected;
        if (startResult == -1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " ~ " + (expected + offset.value), description));
        }
    }

    @Override
    public void isNotCloseTo(Long actual, Long expected, Offset<Long> offset) {
        int startResult = Long.compare(actual, (expected - offset.value));
        int endResult = Long.compare(actual, (expected + offset.value));

        this.defaultDescription = actual + " is close to " + expected;
        if (startResult == 1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " > " + actual + " or " + (expected + offset.value)
                    + " < " + actual, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Long actual, Long start, Long end) {
        if ((Long.compare(actual, start) == -1) || ((
            Long.compare(actual, end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
