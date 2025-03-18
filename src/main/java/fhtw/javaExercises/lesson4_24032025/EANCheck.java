package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class EANCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter all 13 digits of an EAN: ");
        long ean = sc.nextLong();

        long workingEAN = ean / 10;

        long sumOfEven = 0;
        long sumOfOdd = 0;

        for (int i = 0; i < 13; i++) {
            if (i % 2 == 0) {
                sumOfEven += workingEAN % 10;
            } else {
                sumOfOdd += workingEAN % 10;
            }
            workingEAN /= 10;
        }

        sumOfEven *= 3;
        sumOfOdd += sumOfEven;
        long totalSum = sumOfOdd;
        totalSum -= 1;
        totalSum %= 10;
        long checkDigit = 9 - totalSum;

        if (ean % 10 != checkDigit) {
            System.out.println("The EAN is NOT VALID.");
        } else {
            System.out.println("The EAN is VALID.");
        }
    }
}
