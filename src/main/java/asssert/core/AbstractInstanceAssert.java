package asssert.core;

public abstract class AbstractInstanceAssert<SELF, ACTUAL> {

    protected  SELF self;

    protected  ACTUAL actual;

    public AbstractInstanceAssert<SELF, ACTUAL> isNull() {
        System.out.println("AbstractInstanceAssert.isNull = " + actual);
        assert actual == null;
        return this;
    }

    public AbstractInstanceAssert<SELF, ACTUAL> isEmpty() {
        System.out.println("AbstractInstanceAssert.isEmpty = " + actual);
        assert actual.toString().isEmpty();
        return this;
    }

    public AbstractInstanceAssert<SELF, ACTUAL> isNotNull() {
        System.out.println("AbstractInstanceAssert.isNull = " + actual);
        assert actual != null;
        return this;
    }

    public AbstractInstanceAssert<SELF, ACTUAL> isNotEmpty() {
        System.out.println("AbstractInstanceAssert.isNull = " + actual);
        assert !actual.toString().isEmpty();
        return this;
    }



}
