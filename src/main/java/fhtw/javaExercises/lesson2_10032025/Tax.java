package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = sc.nextDouble();
        System.out.printf("With tax added: %.2f", amount * 1.2);
    }
}
