package fhtw.javaExercises.lesson4_24032025;

import java.util.Arrays;
import java.util.Scanner;

public class IntervalleSchliessen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] i1 = new int[2];
        int[] i2 = new int[2];
        int[] iG = new int[2];

        askBoundaries(sc, i1, i2);

        iG[0] = findMin(i1, i2);
        iG[1] = findMax(i1, i2);

        sort(i1, i2, iG);

        print(i1, i2, iG);
    }

    public static void askBoundaries(Scanner sc, int[] i1, int[] i2) {
        System.out.print("Grenze 1: ");
        i1[0] = sc.nextInt();
        System.out.print("Grenze 2: ");
        i1[1] = sc.nextInt();

        System.out.print("Grenze 1: ");
        i2[0] = sc.nextInt();
        System.out.print("Grenze 2: ");
        i2[1] = sc.nextInt();
    }

    public static void sort(int[] i1, int[] i2, int[] iG) {
        Arrays.sort(i1);
        Arrays.sort(i2);
        Arrays.sort(iG);
    }

    public static int findMin(int[] i1, int[] i2) {
        int min1 = Arrays.stream(i1).min().orElseThrow();
        int min2 = Arrays.stream(i2).min().orElseThrow();

        return Math.min(min1, min2);
    }

    public static int findMax(int[] i1, int[] i2) {
        int max1 = Arrays.stream(i1).max().orElseThrow();
        int max2 = Arrays.stream(i2).max().orElseThrow();

        return Math.max(max1, max2);
    }

    public static void print(int[] i1, int[] i2, int[] iG) {
        System.out.println("Intervall 1: " + Arrays.toString(i1));
        System.out.println("Intervall 2: " + Arrays.toString(i2));
        System.out.println("Geschlossenes Intervall: " + Arrays.toString(iG));
    }
}
