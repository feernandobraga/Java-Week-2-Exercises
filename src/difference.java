// Exercise 1.1 Write a java program to display the result of difference of two numbers.
// A user will enter two integers ( import Scanner)
// Program will calculate their difference
// Program then display the result

import java.util.Scanner;

public class difference {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner userIO = new Scanner(System.in);

        System.out.println("Please enter the first number");
        firstNumber = userIO.nextInt();

        System.out.println("Please enter the second number");
        secondNumber = userIO.nextInt();

        System.out.println("The difference between " + firstNumber + " and " + secondNumber + " is: " + (firstNumber - secondNumber));

    }

}
