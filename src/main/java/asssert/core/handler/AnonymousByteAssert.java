package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousByteAssert extends AnonymousObjectAssert implements ComparableAssert<Byte>,
    NumberAssert<Byte> {

    public void isEven(Byte actual) {
        boolean result = (actual & 1) == 0;
        this.defaultDescription = String.format("%s is not even", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Odd", description));
        }
    }

    public void isOdd(Byte actual) {
        boolean result = (actual & 1) != 0;
        this.defaultDescription = String.format("%s is not odd", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Even", description));
        }
    }


    @Override
    public void isLessThan(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = String.format("%s is not less than %s", actual, expected);
        if (result >= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isPositive(Byte actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is not positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Byte actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Byte actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is not negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Byte actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Byte actual) {
        boolean result = actual == 0;
        this.defaultDescription = String.format("%s is not zero", actual);
        ;
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Byte actual) {
        boolean result = actual != 0;
        this.defaultDescription = String.format("%s is zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        int startResult = Byte.compare(actual, (byte) (expected - offset.value));
        int endResult = Byte.compare(actual, (byte) (expected + offset.value));
        this.defaultDescription = String.format("%s is not close to %s", actual, expected);
        if (startResult < 0 || endResult > 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " ~ " + (expected + offset.value), description));
        }
    }

    @Override
    public void isNotCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        int startResult = Byte.compare(actual, (byte) (expected - offset.value));
        int endResult = Byte.compare(actual, (byte) (expected + offset.value));
        this.defaultDescription = String.format("%s is close to %s", actual, expected);
        if (startResult >= 0 || endResult >= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                "start >= " + actual + " or end <= " + actual, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = String.format("%s is not less than or equal to %s", actual,
            expected);
        ;
        if (result > 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = String.format("%s is not greater than %s", actual, expected);
        if (result <= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = String.format("%s is not greater than or Equal to %s", actual,
            expected);
        if (result < 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Byte actual, Byte start, Byte end) {
        if ((Byte.compare(actual, start) < 0) || ((
            Byte.compare(actual, end) > 0))) {
            this.defaultDescription = String.format("%s is not between %s and %s", actual, start,
                end);
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
