package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class MilchFun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fettgehalt: ");
        int fettgehalt = sc.nextInt();

        System.out.print("Haltbar: ");
        int haltbar = sc.nextInt();

        ausgabe(klasse(fettgehalt, haltbar));
    }

    static int klasse(double fett, int haltbar) {
        if (fett < 0 || fett > 100 || haltbar > 1) {
            return -1;
        }
        if (fett > 7 && haltbar == 0) {
            return 1;
        }
        if (fett > 7 && haltbar == 1) {
            return 2;
        }
        if (fett < 3 && haltbar == 0) {
            return 3;
        }
        if (fett < 3 && haltbar == 1) {
            return 4;
        }
        if ((fett >= 3 && fett <= 7) && haltbar == 0) {
            return 5;
        }
        if ((fett >= 3 && fett <= 7) && haltbar == 1) {
            return 6;
        }
        return -1;
    }

    static void ausgabe(int k) {
        switch (k) {
            case -1:
                System.out.println("Ungueltige Klassifizierung!");
                break;
            case 1:
                System.out.println("Extravollmilch (frisch)");
                break;
            case 2:
                System.out.println("Extravollmilch (haltbar)");
                break;
            case 3:
                System.out.println("Leichtmilch (frisch)");
                break;
            case 4:
                System.out.println("Leichtmilch (haltbar)");
                break;
            case 5:
                System.out.println("Normalmilch (frisch)");
                break;
            case 6:
                System.out.println("Normalmilch (haltbar)");
                break;
            default:
                System.out.println("Ungueltiges Argument!");
                break;
        }
    }
}
