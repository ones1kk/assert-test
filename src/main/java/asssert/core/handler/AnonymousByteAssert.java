package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousByteAssert extends AnonymousObjectAssert implements ComparableAssert<Byte>,
    NumberAssert<Byte> {

    public void isEven(Byte actual) {
        boolean result = (actual & 1) == 0;
        this.defaultDescription = actual + " is not even";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Odd", description));
        }
    }

    public void isOdd(Byte actual) {
        boolean result = (actual & 1) != 0;
        this.defaultDescription = actual + " is not odd";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Even", description));
        }
    }


    @Override
    public void isLessThan(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result >= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isPositive(Byte actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is not positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Byte actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Byte actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is not negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Byte actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Byte actual) {
        boolean result = actual == 0;
        this.defaultDescription = actual + " is not zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Byte actual) {
        boolean result = actual != 0;
        this.defaultDescription = actual + " is zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        int startResult = Byte.compare(actual, (byte) (expected - offset.value));
        int endResult = Byte.compare(actual, (byte) (expected + offset.value));
        this.defaultDescription = actual + " is not close to " + expected;
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
        this.defaultDescription = actual + " is close to " + expected;
        if (startResult >= 0 || endResult >= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                "start >= " + actual + " or end <= " + actual, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result > 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result <= 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Byte actual, Byte expected) {
        int result = Byte.compare(actual, expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result < 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Byte actual, Byte start, Byte end) {
        if ((Byte.compare(actual, start) < 0) || ((
            Byte.compare(actual, end) > 0))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
