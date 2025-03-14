package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class Artikelnummern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Artikelgruppe:");
        int artikelgruppe = sc.nextInt();

        if (artikelgruppe < 1 || artikelgruppe > 3) {
            System.out.println("Falsche Eingabe.");
            return;
        }

        System.out.println("Untergruppe:");
        int untergruppe = sc.nextInt();

        if (artikelgruppe == 1) {
            if (untergruppe < 1 || untergruppe > 3) {
                System.out.println("Falsche Eingabe.");
                return;
            }
        }
        if (artikelgruppe == 2) {
            if (untergruppe < 1 || (untergruppe > 2 && untergruppe != 9)) {
                System.out.println("Falsche Eingabe.");
                return;
            }
        }
        if (artikelgruppe == 3) {
            if (untergruppe != 1) {
                System.out.println("Falsche Eingabe.");
                return;
            }
        }

        System.out.println("Artikelnummer:");
        int artikelnummer = sc.nextInt();

        if (artikelgruppe == 1) {
            if (untergruppe == 1) {
                if (artikelnummer < 1 || artikelnummer > 4) {
                    System.out.println("Falsche Eingabe.");
                    return;
                }
            }
            if (untergruppe == 2) {
                if (artikelnummer < 1 || artikelnummer > 2) {
                    System.out.println("Falsche Eingabe.");
                    return;
                }
            }
            if (untergruppe == 3) {
                if (artikelnummer < 1 || artikelnummer > 2) {
                    System.out.println("Falsche Eingabe.");
                    return;
                }
            }
        }
        if (artikelgruppe == 2) {
            if (untergruppe == 1) {
                if (artikelnummer < 1 || artikelnummer > 2) {
                    System.out.println("Falsche Eingabe.");
                    return;
                }
            }
            if (untergruppe == 2) {
                if (artikelnummer < 1 || artikelnummer > 2) {
                    System.out.println("Falsche Eingabe.");
                    return;
                }
            }
        }
        if (artikelgruppe == 3) {
            if (artikelnummer != 1) {
                System.out.println("Falsche Eingabe.");
                return;
            }
        }

        if (artikelgruppe == 1) {
            if (untergruppe == 1) {
                if (artikelnummer == 1) {
                    System.out.println("Bier (hell, 0,5)");
                }
                if (artikelnummer == 2) {
                    System.out.println("Bier (hell, 0,33)");
                }
                if (artikelnummer == 3) {
                    System.out.println("Zwickel (0,5)");
                }
                if (artikelnummer == 4) {
                    System.out.println("Zwickel (0,33)");
                }
            }
            if (untergruppe == 2) {
                if (artikelnummer == 1) {
                    System.out.println("Cola");
                } else {
                    System.out.println("Fanta");
                }
            }
            if (untergruppe == 3) {
                if (artikelnummer == 1) {
                    System.out.println("Rotwein");
                } else {
                    System.out.println("Weißer Spritzer");
                }
            }
        }
        if (artikelgruppe == 2) {
            if (untergruppe == 1) {
                if (artikelnummer == 1) {
                    System.out.println("Schnitzel");
                } else {
                    System.out.println("Schweinsbraten");
                }
            }
        }
        if (artikelgruppe == 3) {
            if (untergruppe == 2) {
                if (artikelnummer == 1) {
                    System.out.println("Frankfurter");
                }
            }
            if (untergruppe == 9) {
                if (artikelnummer == 1) {
                    System.out.println("Ketchup");
                }
            } else {
                System.out.println("Zigaretten");
            }
        }

    }
}
