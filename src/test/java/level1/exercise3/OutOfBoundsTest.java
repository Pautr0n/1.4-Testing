package level1.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsTest {

    @Test
    void throwOutOfBoundTest() {

        OutOfBounds outOfBounds = new OutOfBounds();
        assertThrows(IndexOutOfBoundsException.class, () -> outOfBounds.throwOutOfBound(5));

    }
}