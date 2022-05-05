package asssert.core.handler;

import asssert.core.feature.IterableAssert;
import java.util.Arrays;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public class AnonymousNumberArrayAssert extends AnonymousObjectAssert implements IterableAssert<Number[]> {

    @Override
    public void isEmpty(Number[] actual) {
        boolean result = ArrayUtils.isEmpty(actual);
        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s is not empty", actualArray);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, "Empty", description));
        }

    }

    @Override
    public void isNotEmpty(Number[] actual) {

    }

    @Override
    public void isNullOrEmpty(Number[] actual) {

    }

    @Override
    public void hasElement(Number[] actual, Number[] expected) {

    }

    @Override
    public void contains(Number[] actual, Number[]... expected) {

    }

    @Override
    public void containsNull(Number[] actual, Number[] expected) {

    }

    @Override
    public void allMatch(Number[] actual, Predicate<Number[]> expected) {

    }

    @Override
    public void noneMatch(Number[] actual, Predicate<Number[]> expected) {

    }
}
