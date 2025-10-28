package level1.exercise2;


public class CalculoDNI {


    static char calculateDniLetter(String dni) {

        if (dni.length() == 8) {
            try {
                int remainder;
                int dniInt = Integer.parseInt(dni);
                String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
                remainder = dniInt % 23;
                return dniLetters.charAt(remainder);
            } catch (NumberFormatException e) {
                System.out.println("only numbers allowed.");
                return '\0';
            }
        } else {
            System.out.println("DNI format not valid");
            return '\0';
        }
    }
}
