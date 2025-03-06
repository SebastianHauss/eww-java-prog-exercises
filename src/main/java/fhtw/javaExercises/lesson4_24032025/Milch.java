package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class Milch {
    final static String leichtmilchFrisch = "Leichtmilch (frisch)";
    final static String leichtmilchHaltbar = "Leichtmilch (haltbar)";
    final static String extravollmilchFrisch = "Extravollmilch (frisch)";
    final static String extravollmilchHaltbar = "Extravollmilch (haltbar)";
    final static String normalmilchFrisch = "Normalmilch (frisch)";
    final static String normalmilchHaltbar = "Normalmilch (haltbar)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fettgehalt;
        int haltbarkeit;

        System.out.print("Fettgehalt: ");
        fettgehalt = sc.nextDouble();
        System.out.print("Haltbar: ");
        haltbarkeit = sc.nextInt();

        if (fettgehalt < 0) {
            System.out.println("Ungueltig!");
            return;
        } else if (haltbarkeit < 0 || haltbarkeit > 1) {
            System.out.println("Ungueltig!");
            return;
        }

        if (fettgehalt >= 3 && fettgehalt <= 7) {
            if (haltbarkeit == 0) {
                System.out.println(normalmilchFrisch);
            } else {
                System.out.println(normalmilchHaltbar);
            }
        } else if (fettgehalt < 3) {
            if (haltbarkeit == 0) {
                System.out.println(leichtmilchFrisch);
            } else {
                System.out.println(leichtmilchHaltbar);
            }
        } else {
            if (haltbarkeit == 0) {
                System.out.println(extravollmilchFrisch);
            } else {
                System.out.println(extravollmilchHaltbar);
            }
        }
    }
}

