package fhtw.javaExercises.lesson4_24032025;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Datum eingeben:");
        System.out.println("Format: TTMMJJJJ");

        int datum = sc.nextInt();

        int days = datum / 1_000_000;
        if (!isValidDay(days)) {
            System.out.println("Tag muss zwischen 1 und 31 liegen!");
            return;
        }

        int months = datum / 10_000 % 100;
        if (!isValidMonth(months)) {
            System.out.println("Monat muss zwischen 1 und 12 liegen!");
            return;
        }


        int years = datum % 10000;
        if (!isValidYear(years)) {
            System.out.println("Jahr muss groesser als 1581 sein!");
            return;
        }

        if (years == 1582 && (months < 10 || months == 10 && days < 15)) {
            System.out.println("Datum muss nach dem 14.10.1582 liegen!");
            return;
        }

        System.out.printf("%02d. %s %d", days, Month.of(months).getDisplayName(TextStyle.FULL_STANDALONE, Locale.GERMAN), years);
    }

    public static boolean isValidDay(int day) {
        return (day > 0 && day <= 31);
    }

    public static boolean isValidMonth(int month) {
        return (month > 0 && month <= 12);
    }

    public static boolean isValidYear(int year) {
        return (year > 1581);
    }

}

