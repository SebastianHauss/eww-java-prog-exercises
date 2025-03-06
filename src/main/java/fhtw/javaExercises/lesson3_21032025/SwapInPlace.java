package fhtw.javaExercises.lesson3_21032025;

import java.util.Scanner;

public class SwapInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give 2 numbers:");
        String num = sc.nextLine();

        String[] numbers = num.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        System.out.println("Before:");
        System.out.println("a = " + num1);
        System.out.println("b: " + num2);

        System.out.println("After:");
        System.out.println("a = " + num2);
        System.out.println("b: " + num1);

        sc.close();
    }
}
