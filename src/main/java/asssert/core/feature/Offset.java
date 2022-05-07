package asssert.core.feature;


import asssert.Assertion;

public final class Offset<T extends Number> {

    public final T value;

    private Offset(T value) {
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        Assertion.assertThat(value).as("offset value should be not null").isNotNull();
        return new Offset<>(value);
    }
}
