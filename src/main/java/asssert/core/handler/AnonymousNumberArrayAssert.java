package asssert.core.handler;

import asssert.core.feature.IterableAssert;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public class AnonymousNumberArrayAssert extends AnonymousObjectAssert implements
    IterableAssert<Number[], Number> {

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
        boolean result = ArrayUtils.isNotEmpty(actual);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s is empty", actualArray);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, "Not Empty", description));
        }
    }

    @Override
    public void isNullOrEmpty(Number[] actual) {
        boolean result = actual == null || ArrayUtils.isEmpty(actual);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s is not null or not empty", actualArray);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, "Null Or Empty", description));
        }
    }

    @Override
    public void hasElement(Number[] actual, Number[] expected) {

    }

    @Override
    public void contains(Number[] actual, Number expected) {
        boolean result = Arrays.asList(actual).contains(expected);
        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s is not contains %s", actualArray, expected);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, null, description));
        }

    }

    @Override
    public void contains(Number[] actual, Number... expected) {
        Arrays.stream(actual).forEach(it -> {
            boolean result = Arrays.asList(expected).contains(it);
            String actualArray = Arrays.deepToString(actual);
            this.defaultDescription = String.format("%s is not contains %s", actualArray, it);
            if (!result) {
                String description = setDescription();
                throw getException(setDefaultText(actualArray, null, description));
            }
        });
    }

    @Override
    public void containsAll(Number[] actual, Number... expected) {

    }

    @Override
    public void containsAny(Number[] actual, Number... expected) {

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
