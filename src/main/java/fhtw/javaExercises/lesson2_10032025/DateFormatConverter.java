package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class DateFormatConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter date (yyyymmdd):");
        int input = sc.nextInt();
        int day, month, year;

        year = input / 10_000;

        day = input % 100;

        month = input % 10_000 / 100;

        if (year < 1582) {
            System.out.println("invalid date");
            return;
        }
        if (year == 1582 && month < 10) {
            System.out.println("invalid date");
            return;
        }
        if (year == 1582 && month == 10 && day <= 16) {
            System.out.println("invalid date");
            return;
        }
        if (year > 2100) {
            System.out.println("invalid date");
            return;
        }

        System.out.printf("%02d.%02d.%d", day, month, year);

        sc.close();
    }
}
