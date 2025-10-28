package level1.exercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class CalculoDNITest {

    final String DNI1 = "46736012", DNI2 = "26903511", DNI3 = "46736011", DNI4 = "467360", DNI5 = "abcdefgh",
            DNI6 = "48976525", DNI7 = "00236958", DNI8 = "39042553", DNI9 = "65986523", DNI10 = "23658965";

    @ParameterizedTest
    @DisplayName("Testing DNI letter for 10 Values")
    @ValueSource(strings = {DNI1, DNI2, DNI3, DNI4, DNI5, DNI6, DNI7, DNI8, DNI9, DNI10})
    void calculateDniLetterTest(String candidate) {

        CalculoDNI.calculateDniLetter(candidate);

    }
}