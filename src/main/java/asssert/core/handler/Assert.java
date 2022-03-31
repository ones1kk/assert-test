package asssert.core.handler;

public abstract class Assert<SELF> {

    protected final SELF self;

    protected final RuntimeException exception = new RuntimeException();


    protected Assert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

}
