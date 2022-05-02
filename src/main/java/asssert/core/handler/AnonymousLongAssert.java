package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousLongAssert extends AnonymousObjectAssert implements
    ComparableAssert<Long>, NumberAssert<Long> {

    public void isEven(Long actual) {
        boolean result = (actual & 1) == 0;
        this.defaultDescription = String.format("%s is not even", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Odd", description));
        }
    }

    public void isOdd(Long actual) {
        boolean result = (actual & 1) != 0;
        this.defaultDescription = String.format("%s is not odd", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Even", description));
        }
    }

    @Override
    public void isLessThan(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
      this.defaultDescription = String.format("%s is not less than %s", actual, expected);
        if (result != -1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isPositive(Long actual) {
        boolean result = actual > 0;
       this.defaultDescription = String.format("%s is not positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Long actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Long actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is not negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Long actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Long actual) {
        boolean result = actual == 0;
        this.defaultDescription = String.format("%s is not zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Long actual) {
        boolean result = actual != 0;
        this.defaultDescription = String.format("%s is zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Long actual, Long expected, Offset<Long> offset) {
        int startResult = Long.compare(actual, (expected - offset.value));
        int endResult = Long.compare(actual, (expected + offset.value));

        this.defaultDescription = String.format("%s is not close to %s", actual, expected);
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

        this.defaultDescription = String.format("%s is close to %s", actual, expected);
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
       this.defaultDescription = String.format("%s is not less than or equal to %s", actual, expected);;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
        this.defaultDescription = String.format("%s is not greater than %s", actual, expected);;
        if (result != 1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Long actual, Long expected) {
        int result = Long.compare(actual, expected);
        this.defaultDescription = String.format("%s is not greater than or Equal to %s", actual, expected);
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Long actual, Long start, Long end) {
        if ((Long.compare(actual, start) == -1) || ((
            Long.compare(actual, end) == 1))) {
            this.defaultDescription = String.format("%s is not between %s and %s", actual, start, end);
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
