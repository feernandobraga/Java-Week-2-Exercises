import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        Scanner userIO = new Scanner(System.in);

        double pi = 3.14;
        double radius;
        double area;

        System.out.println("Please enter the radius");
        radius = userIO.nextDouble();
        area = pi * Math.pow(radius,2);

        System.out.println("The area is: " + area);
    }
}
