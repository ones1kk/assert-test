package asssert.core;

import javax.annotation.Nullable;

public abstract class AbstractInstanceAssert<ACTUAL> {

    protected final Class<?> self;

    protected final ACTUAL actual;

    protected AbstractInstanceAssert(Class<?> self, ACTUAL actual) {
        this.actual = actual;
        this.self = self;
        System.out.println("self = " + self);
    }

    protected Class<?> as(@Nullable  String description, @Nullable Object... args) {
        System.out.println("self = " + self);
        System.out.println("this = " + this);
        return self;
    }

}