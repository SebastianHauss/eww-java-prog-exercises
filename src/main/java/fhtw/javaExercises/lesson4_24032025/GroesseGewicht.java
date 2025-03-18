package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class GroesseGewicht {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Groesse: ");
        int groesse = sc.nextInt();

        System.out.print("Gewicht: ");
        int gewicht = sc.nextInt();

        boolean normal = groesse <= 200 && gewicht <= 90;
        boolean uebergewichtig = groesse <= 200 && gewicht > 90;
        boolean hager = groesse > 200 && gewicht <= 90;
        boolean riesig = groesse > 200 && gewicht > 90;
        boolean unzuverlaesslich = groesse < 50 || gewicht > 200;
        boolean ungueltig = groesse <= 0 || gewicht <= 0;

        if (ungueltig) {
            System.out.print("Ungueltig!");
            return;
        } else if (normal) {
            System.out.print("normal");
        } else if (uebergewichtig) {
            System.out.print("uebergewichtig");
        } else if (hager) {
            System.out.print("hager");
        } else {
            System.out.println("riesig");
        }

        if (unzuverlaesslich) {
            System.out.print(" (*)");
        }
    }
}
