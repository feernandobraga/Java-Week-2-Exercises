import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner userIO = new Scanner(System.in);

        float celsius;
        float fahrenheit;
        float convertedTemperature;

        System.out.println("Enter the temperature in Celsius: ");
        celsius = userIO.nextFloat();

        convertedTemperature = (celsius * 9/5) + 32;
        System.out.println("The equivalent temperature in Fahrenheit is: " + convertedTemperature);
    }

}
