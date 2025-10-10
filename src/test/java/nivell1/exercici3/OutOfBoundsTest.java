package nivell1.exercici3;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsTest {

    @Test
    void throwOutOfBoundTest() {

        try{
            OutOfBounds.throwOutOfBound();
        }catch (IndexOutOfBoundsException e){

            IO.println("Exception caught: " + e);
        }

    }
}