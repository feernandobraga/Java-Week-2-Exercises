public class Volumes {

    public static void main(String[] args) {
        int sunDiameter = 865000;
        int earthDiameter = 7600;
        double pi = 3.14;

        double earthVolume;
        double sunVolume;

        earthVolume = (4.0/3.0) * pi * Math.pow((earthDiameter/2.0),3);
        sunVolume = (4.0/3.0) * pi * Math.pow((sunDiameter/2.0),3);

        System.out.printf("The volume of the Earth is: %.0f cubic miles\n", earthVolume);
        System.out.printf("The volume of the Sun is: %.0f cubic miles\n", sunVolume);
        System.out.println("The ratio of Sun to the volume of the earth is: " + sunDiameter/earthDiameter);

    }

}