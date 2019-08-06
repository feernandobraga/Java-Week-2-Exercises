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
