public class Fuel {
    public static void main(String[] args) {

        double normalRoadConsumption = 100/8;
        double roughRoadConsumption = (normalRoadConsumption * 0.85);

        System.out.printf("In a normal road, the car can travel for up to %.2f kilometers\n", (normalRoadConsumption * 40));
        System.out.printf("In a rough road, the car can travel for up to %.2f kilometers\n", (roughRoadConsumption * 40));

    }
}


