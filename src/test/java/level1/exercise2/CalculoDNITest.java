package level1.exercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class CalculoDNITest {

    final String DNI1 = "46736012", DNI2 = "26903511", DNI3 = "46736011", DNI4 = "467360", DNI5 = "abcdefgh",
            DNI6 = "48976525", DNI7 = "00236958", DNI8 = "39042553", DNI9 = "65986523", DNI10 = "23658965";

    @ParameterizedTest
    @DisplayName("Testing DNI with wrong format")
    @ValueSource(strings = { DNI4, DNI5})
    void testIncorrectFormat(String candidate) {
        assertEquals('\0', CalculoDNI.calculateDniLetter(candidate));
    }

    @ParameterizedTest
    @DisplayName("Testing DNI with wrong format")
    @ValueSource(strings = { DNI1, DNI2,DNI3,DNI6,DNI7,DNI8,DNI9,DNI10})
    void testCorrectFormat(String candidate) {

        switch(candidate){
            case DNI1:
                assertEquals('N',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI2:
                assertEquals('C',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI3:
                assertEquals('B',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI6:
                assertEquals('A',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI7:
                assertEquals('N',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI8:
                assertEquals('F',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI9:
                assertEquals('Y',CalculoDNI.calculateDniLetter(candidate));
                break;
            case DNI10:
                assertEquals('S',CalculoDNI.calculateDniLetter(candidate));
                break;
        }

    }


}