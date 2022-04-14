package asssert.core.description;

import asssert.Assertion;
import asssert.core.exception.AssertException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TextDescriptionTest {

    @Test
    @DisplayName("Check exception message")
    void test1() {
        String actual1 = "hello";
        char actual2 = 'h';

//        Assertion.assertThat(actual1).isEqualTo(actual2);
//        Assertion.assertThat(actual1).isAssignableFrom(Character.class);
//        Assertion.assertThat(actual1).isSameAs(actual2);
//        Assertion.assertThat(actual1).isNull();
//        Assertion.assertThat(actual2).isDigit();
//        Assertion.assertThat(actual2).isUpperCase();

    }

    @Test
    @DisplayName("Description concurrency test(FAIL)")
    void test2() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    String message = Assertions.assertThrows(AssertException.class,
                        () -> Assertion.assertThat("1st").as("first").isNotNull().as("first")
                            .isEmpty()).getMessage();

                    System.out.println(message);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    String message = Assertions.assertThrows(AssertException.class,
                        () -> Assertion.assertThat("2nd").as("first").isNotNull().as("second")
                            .isEmpty()).getMessage();

                    System.out.println(message);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        String message1 = Assertions.assertThrows(AssertException.class,
            () -> Assertion.assertThat("3rd").as("first").isNotNull().as("third")
                .isEmpty()).getMessage();

        System.out.println(message1);
        t1.join();
        t2.join();

    }

}