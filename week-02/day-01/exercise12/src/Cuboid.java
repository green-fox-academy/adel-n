public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double l = 10;
        double w = 10;
        double h = 10;

        System.out.println("Surface Area: " + ((2*w*l) + (2*w*h) + (2*l*h)));
        System.out.println("Volume: " + (l * w * h));

    }
}
