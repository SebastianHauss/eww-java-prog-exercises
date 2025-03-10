package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Zahlendreher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zahl: ");

        int num = sc.nextInt();

        int num1 = num / 100;

        int num2 = num / 10 % 10;

        int num3 = num % 10;

        System.out.printf("Ausgabe: %d%d%d", num3, num2, num1);
    }
}
