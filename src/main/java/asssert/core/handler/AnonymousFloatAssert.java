package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousFloatAssert extends AnonymousObjectAssert implements
    ComparableAssert<Float>, NumberAssert<Float> {

    @Override
    public void isPositive(Float actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is not positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Float actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Float actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is not negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Float actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Float actual) {
        boolean result = actual == 0;
        this.defaultDescription = actual + " is not zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Float actual) {
        boolean result = actual != 0;
        this.defaultDescription = actual + " is zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Float actual, Float expected, Offset<Float> offset) {
        int startResult = Float.compare(actual, (expected - offset.value));
        int endResult = Float.compare(actual, (expected + offset.value));

        this.defaultDescription = actual + " is not close to " + expected;
        if (startResult == -1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " ~ " + (expected + offset.value), description));
        }
    }

    @Override
    public void isNotCloseTo(Float actual, Float expected, Offset<Float> offset) {
        int startResult = Float.compare(actual, (expected - offset.value));
        int endResult = Float.compare(actual, (expected + offset.value));

        this.defaultDescription = actual + " is close to " + expected;
        if (startResult == 1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " > " + actual + " or " + (expected + offset.value)
                    + " < " + actual, description));
        }
    }

    public void isInfinity(Float actual) {
        boolean result = Float.isInfinite(actual);
        this.defaultDescription = actual + " is not infinity";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Finite", description));
        }
    }

    public void isFinite(Float actual) {
        boolean result = Float.isFinite(actual);
        this.defaultDescription = actual + " is not finite";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Infinity", description));
        }
    }

    public void isNaN(Float actual) {
        boolean result = Float.isNaN(actual);
        this.defaultDescription = actual + " is not NaN";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Number", description));
        }
    }

    @Override
    public void isLessThan(Float actual, Float expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Float actual, Float expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Float actual, Float expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Float actual, Float expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Float actual, Float start, Float end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
