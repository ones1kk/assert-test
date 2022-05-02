package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousShortAssert extends AnonymousObjectAssert implements ComparableAssert<Short>,
    NumberAssert<Short> {

    public void isEven(Short actual) {
        boolean result = (actual & 1) == 0;
        this.defaultDescription = String.format("%s is not even", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Odd", description));
        }
    }

    public void isOdd(Short actual) {
        boolean result = (actual & 1) != 0;
        this.defaultDescription = String.format("%s is not odd", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Even", description));
        }
    }


    @Override
    public void isLessThan(Short actual, Short expected) {
        int result = Short.compare(actual, expected);
        this.defaultDescription = String.format("%s is not less than %s", actual, expected);
        if (result >= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isPositive(Short actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is not positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Short actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Short actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is not negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Short actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Short actual) {
        boolean result = actual == 0;
        this.defaultDescription = String.format("%s is not zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Short actual) {
        boolean result = actual != 0;
        this.defaultDescription = String.format("%s is zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Short actual, Short expected, Offset<Short> offset) {
        int startResult = Short.compare(actual, (short) (expected - offset.value));
        int endResult = Short.compare(actual, (short) (expected + offset.value));
        this.defaultDescription = String.format("%s is not close to %s", actual, expected);
        if (startResult < 0 || endResult > 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " ~ " + (expected + offset.value), description));
        }
    }

    @Override
    public void isNotCloseTo(Short actual, Short expected, Offset<Short> offset) {
        int startResult = Short.compare(actual, (short) (expected - offset.value));
        int endResult = Short.compare(actual, (short) (expected + offset.value));
        this.defaultDescription = String.format("%s is close to %s", actual, expected);
        if (startResult >= 0 || endResult >= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                "start >= " + actual + " or end <= " + actual, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Short actual, Short expected) {
        int result = Short.compare(actual, expected);
        this.defaultDescription = String.format("%s is not less than or equal to %s", actual,
            expected);
        ;
        if (result > 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Short actual, Short expected) {
        int result = Short.compare(actual, expected);
        this.defaultDescription = String.format("%s is not greater than %s", actual, expected);
        ;
        if (result <= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Short actual, Short expected) {
        int result = Short.compare(actual, expected);
        this.defaultDescription = String.format("%s is not greater than or Equal to %s", actual,
            expected);
        if (result < 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Short actual, Short start, Short end) {
        if ((Short.compare(actual, start) < 0) || ((
            Short.compare(actual, end) > 0))) {
            this.defaultDescription = String.format("%s is not between %s and %s", actual, start,
                end);
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
