package fhtw.javaExercises.lesson5_03042025;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayEvenStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> evenPositions = new ArrayList<>();
        ArrayList<Integer> evenValues = new ArrayList<>();
        ArrayList<Integer> maxPositions = new ArrayList<>();

        int _evenCount = 0;

        System.out.println("Input");

        for (int i = 0; i < 1024; i++) {
            System.out.print(": ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("re-enter 0 to store as value.");
                System.out.print("any other value ends input: ");
                if (sc.nextInt() == 0) {
                    arr.add(0);
                    evenPositions.add(i);
                    _evenCount++;
                    System.out.println("value 0 stored.");
                } else {
                    System.out.println("Input finished.");
                    break;
                }
            } else {
                arr.add(input);
                if (input % 2 == 0) {
                    evenPositions.add(i);
                    evenValues.add(input);
                    _evenCount++;
                }
            }
        }

        int sumOfEven = 0;
        for (int e : evenValues) {
            sumOfEven += e;
        }

        int maxOfEven = 0;
        if (!evenValues.isEmpty()) {
            maxOfEven = Collections.max(evenValues);
        }

        double meanOfEven = 0;
        try {
            meanOfEven = (double) sumOfEven / _evenCount;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       if (!evenValues.isEmpty()) {
           for (int i = 0; i < arr.size(); i++) {
               if (i == arr.indexOf(maxOfEven)) {
                   maxPositions.add(i);
               }
           }
       }

        System.out.printf("%s: %d", "count", _evenCount);
        System.out.println();

        if (!evenValues.isEmpty()) {
            System.out.println("index positions: " + evenPositions);
        }

        if (!evenValues.isEmpty()) {
            System.out.printf("%s: %d", "sum", sumOfEven);
            System.out.println();
        }
        if (!evenValues.isEmpty()) {
            System.out.printf("%s: %.2f", "mean", meanOfEven);
            System.out.println();
        }

        if (!evenValues.isEmpty()) {
            System.out.printf("%s: %d ", "max", maxOfEven);
        }

        if (!evenValues.isEmpty()) {
            System.out.println(maxPositions);
        }
    }
}
