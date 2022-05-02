package asssert.core.description;

import javax.annotation.Nullable;

public class TextDescription extends Description {

    public String setDefaultText(Object actual, @Nullable Object expected, String description) {
        if (expected != null) {
            return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s",
                WHITE, RED + expected, WHITE, RED + actual, WHITE, RED + description);
        } else {
            return String.format("%n%sActual      : %s%n%sDescription : %s", WHITE, RED + actual, WHITE, RED + description);

        }
    }
}


