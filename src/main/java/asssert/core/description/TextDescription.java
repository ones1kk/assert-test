package asssert.core.description;

import javax.annotation.Nullable;

public class TextDescription extends Description {

    public String setDefaultText(Object actual, @Nullable Object expected, String description) {
        if (expected != null) {
            return String.format(
                "\n" + WHITE + "Expected    : %s \n" + WHITE + "Actual      : %s\n" + WHITE
                    + "Description : %s",
                RED + expected, RED + actual, RED + description);
        } else {
            return String.format(
                "\n" + WHITE + "Actual      : %s\n" + WHITE
                    + "Description : %s",
                RED + actual, RED + description);
        }
    }
}


