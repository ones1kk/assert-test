package asssert.core.feature;


public final class Offset<T extends Number> {

    public final T value;

    private Offset(T value) {
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        if (value == null) {
            throw new NullPointerException("offset value should be not null");
        }
        return new Offset<>(value);
    }
}
