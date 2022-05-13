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

    public void isMax(Number[] actual, Number expected) {
        Arrays.sort(actual);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("max value of %s is not %s", actualArray, expected);

        Number number = actual[actual.length - 1];
        System.out.println("number = " + number);
        if (!number.equals(expected)) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, expected, description));
        }
    }

    public void isMin(Number[] actual, Number expected) {
        Arrays.sort(actual);

        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("min value of %s is not %s", actualArray, expected);

        Number number = actual[0];
        if (!number.equals(expected)) {
            String description = setDescription();
            throw getException(setDefaultText(actualArray, expected, description));
        }
    }

    public void isSum(Number[] actual, Number expected) {
        String actualArray = Arrays.deepToString(actual);
        this.defaultDescription = String.format("sum value of %s is not %s", actualArray, expected);
        extracted1(actual, expected, actualArray);
    }

    private void extracted1(Number[] actual, Number expected, String actualArray) {
        int[] integers;
        double[] doubles;
        long[] longs;
        short[] shorts;
        byte[] bytes;
        float[] floats;

        int integerSum = 0;
        double doubleSum = 0;
        long longSum = 0;
        short shortSum = 0;
        byte byteSum = 0;
        float floatSum = 0;

        double sum = 0;
//        for (Number number : actual) {
//            sum += number.doubleValue();
//        }

        if(actual instanceof Integer[]) {
            integers = new int[actual.length];
            for (int i = 0; i < actual.length; i++) {
                integers[i] = (Integer) actual[i];
            }
            integerSum = Arrays.stream(integers).sum();
        }

        if(actual instanceof Double[]) {
            doubles = new double[actual.length];
            for (int i = 0; i < actual.length; i++) {
                doubles[i] = (Double) actual[i];
            }
            doubleSum = Arrays.stream(doubles).sum();
        }

        if(actual instanceof Long[]) {
            longs = new long[actual.length];
            for (int i = 0; i < actual.length; i++) {
                longs[i] = (Long) actual[i];
            }
            longSum = Arrays.stream(longs).sum();
        }

        if(actual instanceof Short[]) {
            shorts = new short[actual.length];
            for (int i = 0; i < actual.length; i++) {
                shorts[i] = (Short) actual[i];
                shortSum += shorts[i];
            }
        }

        if(actual instanceof Byte[]) {
            bytes = new byte[actual.length];
            for (int i = 0; i < actual.length; i++) {
                bytes[i] = (Byte) actual[i];
                byteSum += bytes[i];
            }
        }
        if(actual instanceof Float[]) {
            floats = new float[actual.length];
            for (int i = 0; i < actual.length; i++) {
                floats[i] = (Float) actual[i];
                floatSum += floats[i];
            }
        }

        String description = setDescription();
        if( actual instanceof Integer[] && integerSum != expected.intValue()) {
            throw getException(setDefaultText(actualArray, expected, description));
        }

        if( actual instanceof Double[] && doubleSum != expected.doubleValue()) {
            throw getException(setDefaultText(actualArray, expected, description));
        }

        if( actual instanceof Long[] && longSum != expected.longValue()) {
            throw getException(setDefaultText(actualArray, expected, description));
        }

        if( actual instanceof Short[] && shortSum != expected.shortValue()) {
            throw getException(setDefaultText(actualArray, expected, description));
        }

        if( actual instanceof Byte[] && byteSum != expected.byteValue()) {
            throw getException(setDefaultText(actualArray, expected, description));
        }

        if( actual instanceof Float[] && floatSum != expected.floatValue()) {
            throw getException(setDefaultText(actualArray, expected, description));
        }
    }

}
