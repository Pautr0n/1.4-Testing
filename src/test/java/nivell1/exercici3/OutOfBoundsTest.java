package nivell1.exercici3;

import org.junit.jupiter.api.Test;

class OutOfBoundsTest {

    @Test
    void throwOutOfBoundTest() {

        try {
            OutOfBounds.throwOutOfBound();
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Exception caught: " + e);
        }

    }
}