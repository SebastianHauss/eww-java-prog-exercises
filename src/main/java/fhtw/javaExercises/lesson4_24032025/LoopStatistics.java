package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class LoopStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter numbers: (0 or negative to quit)");

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        int counter = 0;

        while (true) {
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

            sum += number;
            counter++;
        }

        sc.close();

        if (counter == 0) {
            System.out.println("no number entered");
        } else {
            System.out.println("min: " + min);
            System.out.println("max: " + max);
            System.out.println("mean: " + (sum / counter));
        }
    }
}
