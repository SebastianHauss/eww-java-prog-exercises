package fhtw.javaExercises.lesson4_24032025;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TickTrickTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int previous = Integer.MIN_VALUE;
        int current;
        int count = 0;
        int repeatCount = 1;

        while (true) {
            System.out.print("Eingabe: ");
            current = sc.nextInt();
            count++;

            if (count > 1) {
                if (current < previous) {
                    System.out.println("Tick");
                } else if (current > previous) {
                    System.out.println("Trick");
                } else {
                    System.out.println("Track");
                    repeatCount++;

                    if (repeatCount == 3) {
                        break;
                    }
                }
            }

            if (current != previous) {
                repeatCount = 1;
            }
            previous = current;
        }

        System.out.printf("Ende (%d Eingaben)", count);
    }
}
