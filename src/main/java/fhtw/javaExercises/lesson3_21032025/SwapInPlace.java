package fhtw.javaExercises.lesson3_21032025;

import java.util.Scanner;

public class SwapInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before: ");
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After: ");
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);

        sc.close();
    }
}
