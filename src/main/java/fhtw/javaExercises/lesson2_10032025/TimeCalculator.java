package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the TimeCalculator!");
        System.out.print("please enter a duration in milliseconds: ");
        long milliseconds = sc.nextLong();

        System.out.println(milliseconds + " ms are exactly:");

        long days = milliseconds / (1000 * 60 * 60 * 24);

        long hours = milliseconds / (1000 * 60 * 60) % 24;

        long minutes = milliseconds / (1000 * 60) % 60;

        long seconds = milliseconds / 1000 % 60;

        long ms = milliseconds % 1000;

        System.out.printf("%7s %d", "days", days);
        System.out.println();

        System.out.printf("%7s %d", "hours", hours);
        System.out.println();

        System.out.printf("%7s %d", "minutes", minutes);
        System.out.println();

        System.out.printf("%7s %d", "seconds", seconds);
        System.out.println();

        System.out.printf("%7s %d", "ms", ms);
    }
}
