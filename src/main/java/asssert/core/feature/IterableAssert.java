package asssert.core.feature;

import java.util.function.Predicate;

public interface IterableAssert<ACTUAL> {

    void isEmpty(ACTUAL actual);

    void isNotEmpty(ACTUAL actual);

    void isNullOrEmpty(ACTUAL actual);

    void hasElement(ACTUAL actual, ACTUAL expected);

    void contains(ACTUAL actual, ACTUAL... expected);

    void containsNull(ACTUAL actual, ACTUAL expected);

    void allMatch(ACTUAL actual, Predicate<ACTUAL> expected);

    void noneMatch(ACTUAL actual, Predicate<ACTUAL> expected);


}
