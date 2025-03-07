package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length of a side: >");

        int length = scanner.nextInt();
        double surfaceArea = length * length * 6;
        System.out.printf("Surface area: %.2f\n", surfaceArea);

        double cubeVolume = length * length * length;
        System.out.printf("Volume: %.2f", cubeVolume);
    }
}
