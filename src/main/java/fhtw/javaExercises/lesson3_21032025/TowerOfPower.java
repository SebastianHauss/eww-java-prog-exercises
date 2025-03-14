package fhtw.javaExercises.lesson3_21032025;

import java.util.Scanner;

public class TowerOfPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base: ");
        int base = sc.nextInt();
        System.out.println();

        for (int i = 1; i < 8; i++) {
            System.out.printf("%8.0f", Math.pow(base, i));
            System.out.println();
        }
    }
}
