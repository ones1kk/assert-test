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
    public void contains(Number[] actual, Number expected) {
        boolean result = Arrays.asList(actual).contains(expected);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s doesn't contains of %s", actualArray, expected);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, null, description));
        }
    }

    @Override
    public void doesNotContain(Number[] actual, Number expected) {
        boolean result = Arrays.asList(actual).contains(expected);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s contains of %s", actualArray, expected);

        if (result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, null, description));
        }
    }

    @Override
    public void containsAll(Number[] actual, Number... expected) {
        List<Number> numbers = Arrays.asList(actual);
        Arrays.asList(expected).forEach(it -> {
            boolean result = numbers.contains(it);

            String actualArray = Arrays.deepToString(actual);
            this.defaultDescription = String.format("%s doesn't contain of %s", actualArray, it);

            if (!result) {
                String description = setDescription();
                throw getException(setDefaultText(actualArray, null, description));
            }
        });
    }

    @Override
    public void containsAny(Number[] actual, Number... expected) {
        List<Number> numbers = Arrays.asList(actual);
        boolean result = false;
        for (int i = 0; i < expected.length; i++) {
            result = numbers.contains(expected[i]);
            if (result) {
                return;
            }
        }

        String actualArray = Arrays.deepToString(actual);
        String expectedArray = Arrays.deepToString(expected);
        this.defaultDescription = String.format("%s doesn't contain any of %s", actualArray,
            expectedArray);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, null, description));
        }

    }

    @Override
    public void containsNull(Number[] actual) {
        boolean result = Arrays.asList(actual).contains(null);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s doesn't contain of null", actualArray);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, "doesn't contain of null", description));
        }
    }

    @Override
    public void doesNotContainNull(Number[] actual) {
        boolean result = Arrays.asList(actual).contains(null);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s contains of null", actualArray);

        if (result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, "contains of null", description));
        }

    }

    @Override
    public void allMatch(Number[] actual, Predicate<Number[]> expected) {
        boolean result = expected.test(actual);
        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s is not all matched", actualArray);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, null, description));
        }
    }

    @Override
    public void noneMatch(Number[] actual, Predicate<Number[]> expected) {
        boolean result = expected.negate().test(actual);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("%s is matched with all of expected", actualArray);

        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, actualArray, description));
        }

    }
}
