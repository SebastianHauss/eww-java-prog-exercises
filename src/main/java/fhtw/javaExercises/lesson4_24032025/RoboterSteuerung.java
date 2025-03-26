package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class RoboterSteuerung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Art: ");
            int art = sc.nextInt();

            if (art == 0) {
                break;
            }

            if (art > 4) {
                System.out.println("** Fehler: Art unbekannt");
            }

            switch (art) {
                case 1:
                    System.out.print("1: ");
                    float spaceFront = sc.nextFloat();
                    if (spaceFront < 0 || spaceFront > 10) {
                        System.out.println("** Fehler: Werebereich");
                        break;
                    }
                    System.out.println("Abstand vorne: " + spaceFront);
                    break;
                case 2:
                    System.out.print("2: ");
                    float spaceBack = sc.nextFloat();
                    if (spaceBack < 0 || spaceBack > 10) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.println("Abstand hinten: " + spaceBack);
                    break;
                case 3:
                    System.out.print("1: ");
                    float x_g = sc.nextFloat();
                    if (x_g < -250 || x_g > 250) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.print("2: ");
                    float y_g = sc.nextFloat();
                    if (y_g < -250 || y_g > 250) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.print("3: ");
                    float z_g = sc.nextFloat();
                    if (z_g < -250 || z_g > 250) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.printf("Gyroskop: (%.2f, %.2f, %.2f) g\n", x_g, y_g, z_g);
                    break;
                case 4:
                    System.out.print("1: ");
                    float x_m = sc.nextFloat();
                    if (x_m < 0 || x_m > 1) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.print("1: ");
                    float y_m = sc.nextFloat();
                    if (y_m < 0 || y_m > 1) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.print("1: ");
                    float z_m = sc.nextFloat();
                    if (z_m < 0 || z_m > 1) {
                        System.out.println("** Fehler: Wertebereich");
                        break;
                    }
                    System.out.printf("Magnetometer: (%.2f, %.2f, %.2f) T\n", x_m, y_m, z_m);
                    break;
            }
        }
    }
}
