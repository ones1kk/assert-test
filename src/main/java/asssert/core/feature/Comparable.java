package asssert.core.feature;

public interface Comparable<ELEMENT> {

    void isLessThan(ELEMENT element);

    void isLessThanOrEqualTo(ELEMENT element);

    void isGreaterThan(ELEMENT element);

    void isGreaterThanOrEqualTo(ELEMENT element);

    void isBetween(Object start, Object end);

    void isEqualTo(ELEMENT element);

}
