package nivell1.exercici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoDNI {


    static void calculateDniLetter(String dni){

        if(dni.length()==8){
            try{
                int remainder;
                int dniInt = Integer.parseInt(dni);
                String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
                remainder = dniInt % 23;
                IO.println("DNI: " + dni + dniLetters.charAt(remainder));
            } catch (NumberFormatException e){
                IO.println("only numbers allowed.");
            }
        }else{
            IO.println("DNI format not valid");
        }
    }
}
