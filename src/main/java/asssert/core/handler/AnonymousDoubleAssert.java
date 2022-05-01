package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousDoubleAssert extends AnonymousObjectAssert implements
    ComparableAssert<Double>, NumberAssert<Double> {

    @Override
    public void isPositive(Double actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is not positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Double actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is positive";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Double actual) {
        boolean result = actual < 0;
        this.defaultDescription = actual + " is not negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Double actual) {
        boolean result = actual > 0;
        this.defaultDescription = actual + " is negative";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Double actual) {
        boolean result = actual == 0;
        this.defaultDescription = actual + " is not zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Double actual) {
        boolean result = actual != 0;
        this.defaultDescription = actual + " is zero";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Double actual, Double expected, Offset<Double> offset) {
        int startResult = Double.compare(actual, (expected - offset.value));
        int endResult = Double.compare(actual, (expected + offset.value));

        this.defaultDescription = actual + " is not close to " + expected;
        if (startResult == -1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " ~ " + (expected + offset.value), description));
        }
    }

    @Override
    public void isNotCloseTo(Double actual, Double expected, Offset<Double> offset) {
        int startResult = Double.compare(actual, (expected - offset.value));
        int endResult = Double.compare(actual, (expected + offset.value));

        this.defaultDescription = actual + " is close to " + expected;
        if (startResult == 1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " > " + actual + " or " + (expected + offset.value)
                    + " < " + actual, description));
        }
    }

    public void isInfinity(Double actual) {
        boolean result = Double.isInfinite(actual);
        this.defaultDescription = actual + " is not infinity";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Finite", description));
        }
    }

    public void isFinite(Double actual) {
        boolean result = Double.isFinite(actual);
        this.defaultDescription = actual + " is not finite";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Infinity", description));
        }
    }

    public void isNaN(Double actual) {
        boolean result = Double.isNaN(actual);
        this.defaultDescription = actual + " is not NaN";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Number", description));
        }
    }

    @Override
    public void isLessThan(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than " + expected;
        if (result != -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not less than or Equal to " + expected;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than " + expected;
        if (result != 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = actual + " is not greater than or Equal to " + expected;
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Double actual, Double start, Double end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = actual + " is not between " + start + "  and " + end;
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
