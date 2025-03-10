package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Geburtsdatum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geburtsdatum: ");
        int input = sc.nextInt();

        int num3 = input / 10_000;

        int num2 = input / 100 % 100;

        int num1 = input % 100;

        System.out.printf("Ausgabe: %02d%02d%02d", num1, num2, num3);

        sc.close();
    }
}
