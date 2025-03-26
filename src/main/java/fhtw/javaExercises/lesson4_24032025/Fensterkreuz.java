package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class Fensterkreuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int breite = getWidth(sc);

        int hoehe = getHeigth(sc);

        int horizontal = getHorizontal(sc, breite);

        int vertikal = getVertikal(sc, hoehe);

        draw(breite, hoehe, horizontal, vertikal);
    }

    public static int getWidth(Scanner sc) {
        int width = -1;
        do {
            System.out.print("Breite: ");
            width = sc.nextInt();
        } while (width <= 0);
        return width;
    }

    public static int getHeigth(Scanner sc) {
        int heigth = -1;
        do {
            System.out.print("Hoehe: ");
            heigth = sc.nextInt();
        } while (heigth <= 0);
        return heigth;
    }

    public static int getHorizontal(Scanner sc, int breite) {
        int horizontal = -1;
        do {
            System.out.print("horizontal: ");
            horizontal = sc.nextInt();
        } while (horizontal <= 0 || horizontal >= breite);
        return horizontal;
    }

    public static int getVertikal(Scanner sc, int hoehe) {
        int vertikal = -1;
        do {
            System.out.print("vertikal: ");
            vertikal = sc.nextInt();
        } while (vertikal <= 0 || vertikal >= hoehe);
        return vertikal;
    }

    public static void draw(int breite, int hoehe, int horizontal, int vertikal) {
        int dots = 0;

        for (int row = 0; row < hoehe; row++) {

            for (int col = 0; col < breite; col++) {

                if (row == vertikal - 1 && col == horizontal - 1) {
                    System.out.print("+");
                } else if (row == vertikal - 1) {
                    System.out.print("-");
                } else if (col == horizontal - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(".");
                    dots++;
                }

                if (col == breite - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println(dots + " dot(s).");
    }
}