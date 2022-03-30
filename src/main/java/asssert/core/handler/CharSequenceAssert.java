package asssert.core.handler;

public class CharSequenceAssert<ACTUAL extends AbstractAssert<ACTUAL>> extends AbstractAssert<ACTUAL>{

    protected CharSequenceAssert(ACTUAL actual) {
        super(actual);
        boolean support = isSupport(actual);
        if(!support) throw actual.exception;
    }

    void isUpperCase(Character actual) {
        boolean result = Character.isUpperCase(actual);
        if(!result) throw exception;
    }

    @Override
    public boolean isSupport(ACTUAL character) {
        return character.getClass().isAssignableFrom(Character.class);
    }

}
