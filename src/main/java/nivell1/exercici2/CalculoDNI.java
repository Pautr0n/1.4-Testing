package nivell1.exercici2;


public class CalculoDNI {


    static void calculateDniLetter(String dni) {

        if (dni.length() == 8) {
            try {
                int remainder;
                int dniInt = Integer.parseInt(dni);
                String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
                remainder = dniInt % 23;
                System.out.println("DNI: " + dni + dniLetters.charAt(remainder));
            } catch (NumberFormatException e) {
                System.out.println("only numbers allowed.");
            }
        } else {
            System.out.println("DNI format not valid");
        }
    }
}
