package asssert.core.handler;

public abstract class Assert<SELF, ACTUAL> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final RuntimeException exception = new RuntimeException();


    protected Assert(Class<?> self, ACTUAL actual) {
        this.self = (SELF) self.cast(this);
        this.actual = actual;
    }

}
