package asssert.core.handler;

import asssert.core.feature.ComparableAssert;
import asssert.core.feature.NumberAssert;
import asssert.core.feature.Offset;

public class AnonymousDoubleAssert extends AnonymousObjectAssert implements
    ComparableAssert<Double>, NumberAssert<Double> {

    @Override
    public void isPositive(Double actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is not positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Positive", description));
        }
    }

    @Override
    public void isNotPositive(Double actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is positive", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Positive", description));
        }
    }

    @Override
    public void isNegative(Double actual) {
        boolean result = actual < 0;
        this.defaultDescription = String.format("%s is not negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Negative", description));
        }
    }

    @Override
    public void isNotNegative(Double actual) {
        boolean result = actual > 0;
        this.defaultDescription = String.format("%s is negative", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Negative", description));
        }
    }

    @Override
    public void isZero(Double actual) {
        boolean result = actual == 0;
        this.defaultDescription = String.format("%s is not zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Zero", description));
        }
    }

    @Override
    public void isNotZero(Double actual) {
        boolean result = actual != 0;
        this.defaultDescription = String.format("%s is zero", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Not Zero", description));
        }
    }

    @Override
    public void isCloseTo(Double actual, Double expected, Offset<Double> offset) {
        int startResult = Double.compare(actual, (expected - offset.value));
        int endResult = Double.compare(actual, (expected + offset.value));

        this.defaultDescription = String.format("%s is not close to %s", actual, expected);
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

        this.defaultDescription = String.format("%s is close to %s", actual, expected);
        if (startResult == 1 || endResult == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual,
                (expected - offset.value) + " > " + actual + " or " + (expected + offset.value)
                    + " < " + actual, description));
        }
    }

    public void isInfinity(Double actual) {
        boolean result = Double.isInfinite(actual);
        this.defaultDescription = String.format("%s is not infinity", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Finite", description));
        }
    }

    public void isFinite(Double actual) {
        boolean result = Double.isFinite(actual);
        this.defaultDescription = String.format("%s is not finite", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Infinity", description));
        }
    }

    public void isNaN(Double actual) {
        boolean result = Double.isNaN(actual);
        this.defaultDescription = String.format("%s is not NaN", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, "Number", description));
        }
    }

    @Override
    public void isLessThan(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not less than %s", actual, expected);
        if (result != -1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isLessThanOrEqualTo(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not less than or equal to %s", actual,
            expected);
        ;
        if (result == 1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThan(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not greater than %s", actual, expected);
        ;
        if (result != 1 || result == 0) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isGreaterThanOrEqualTo(Double actual, Double expected) {
        int result = actual.compareTo(expected);
        this.defaultDescription = String.format("%s is not greater than or Equal to %s", actual,
            expected);
        if (result == -1) {
            String description = setDescription();
            throw getException(setDefaultText(actual, expected, description));
        }
    }

    @Override
    public void isBetween(Double actual, Double start, Double end) {
        if ((actual.compareTo(start) == -1) || ((
            actual.compareTo(end) == 1))) {
            this.defaultDescription = String.format("%s is not between %s and %s", actual, start,
                end);
            String description = setDescription();
            throw getException(setDefaultText(actual, start + " ~ " + end, description));
        }
    }
}
