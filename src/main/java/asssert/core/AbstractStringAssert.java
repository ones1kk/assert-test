package asssert.core;

public class AbstractStringAssert<SELF, ACTUAL> extends AbstractInstanceAssert<SELF, ACTUAL> {

    protected AbstractStringAssert(ACTUAL actual, SELF self) {
        this.actual = actual;
        this.self =  self;
        System.out.println("AbstractStringAssert.AbstractStringAssert = " + actual);
    }

    protected AbstractStringAssert() {

    }
}
