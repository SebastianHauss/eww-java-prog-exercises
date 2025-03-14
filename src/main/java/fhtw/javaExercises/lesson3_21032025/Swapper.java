package fhtw.javaExercises.lesson3_21032025;

import java.util.Scanner;

public class Swapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("enter seconds number (b): ");
        int b = sc.nextInt();
        System.out.printf("a=%d, b=%d\n", a, b);
        System.out.println("swapped:");
        System.out.printf("a=%d, b=%d", b, a);
    }
}
