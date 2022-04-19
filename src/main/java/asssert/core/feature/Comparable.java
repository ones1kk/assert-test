package asssert.core.feature;

public interface Comparable<ACTUAL> {

    void isLessThan(ACTUAL actual, Object expected);

    void isLessThanOrEqualTo(ACTUAL actual, Object expected);

    void isGreaterThan(ACTUAL actual, Object expected);

    void isGreaterThanOrEqualTo(ACTUAL actual, Object expected);

    void isBetween(ACTUAL actual, Object start, Object end);

}