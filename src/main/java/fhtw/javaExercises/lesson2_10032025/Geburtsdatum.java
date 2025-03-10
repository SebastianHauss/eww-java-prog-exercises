package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Geburtsdatum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geburtsdatum: (TTMMJJ) ");
        int input = sc.nextInt();

        int num1 = input / 10_000;
        System.out.println(num1);

        sc.close();
    }
}
