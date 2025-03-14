package fhtw.javaExercises.lesson3_21032025;

import java.util.Scanner;

public class SwapInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please give 2 numbers:");
        String num = sc.nextLine();

        String[] numbers = num.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        System.out.println("Before:");
        System.out.println("a = " + num1);
        System.out.println("b: " + num2);

        num1 = Integer.parseInt(numbers[1]);
        num2 = Integer.parseInt(numbers[0]);

        System.out.println("After:");
        System.out.printf(" a= %d\n", num1);
        System.out.printf(" b: %d", num2);

        sc.close();
    }
}
