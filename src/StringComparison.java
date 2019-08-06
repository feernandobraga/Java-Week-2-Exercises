import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String firstString;
        String secondString;

        System.out.println("Please enter a string:");
        firstString = userInput.next();

        System.out.println("Now please enter a second string");
        secondString = userInput.next();

        if (firstString.equals(secondString)) { //compares if the strings are identical
            System.out.println("\nthe two given strings are equal");
        } else if (firstString.charAt(0) == secondString.charAt(0)){ // if the strings are not identical, compares only the first characters
            System.out.println("\nthe strings are not equal, but the first character is");
        } else { // if neither conditions are satisfied, it prints that the strings are different
            System.out.println("\nthe strings are different");
        }

    }

}
