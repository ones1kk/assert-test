package asssert.core.feature;

public interface Iterable<ELEMENT> {

    void isEmpty();

    void isNullOrEmpty();

    void hasElement(ELEMENT element);

    void contains(ELEMENT element);

}
