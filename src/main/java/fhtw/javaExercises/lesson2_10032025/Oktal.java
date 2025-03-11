package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Oktal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Oktalzahl eingeben: ");
        int numOctal = sc.nextInt();

        int vierundsechziger = numOctal / 100;
        int achter = numOctal / 10 % 10;
        int einerOctal = numOctal % 10;

        int numDez = (vierundsechziger * 64) + (achter * 8) + (einerOctal * 1);
        System.out.printf("dezimal: %d\n", numDez);

        int hunderter = numDez / 100;
        int zehner = numDez / 10 % 10;
        int einerDez = numDez % 10;

        System.out.printf("Ziffernsumme: %d", hunderter + zehner + einerDez);


    }
}
