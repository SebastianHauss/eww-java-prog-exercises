package fhtw.javaExercises.lesson4_24032025;

import java.util.Arrays;
import java.util.Scanner;

public class Noten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Noten (NNN): ");
        String input = sc.nextLine();

        if (input.length() != 3) {
            System.out.println("Erwarte genau 3 Noten!");
            return;
        }

        int[] grades = new int[3];

        for (int i = 0; i < input.length(); i++) {
            grades[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        System.out.println(Arrays.toString(grades));

        for (int g : grades) {
            if (g < 1 || g > 5) {
                System.out.print(g == grades[0] ? "Erste " : g == grades[1] ? "Zweite " : "Dritte ");
                System.out.println("Note muss zwischen 1 und 5 liegen!");
                return;
            }
            if (g == 5) {
                System.out.println("Nicht bestanden!");
                return;
            }
        }
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        if (sum == 3) {
            System.out.println("Ausgezeichneter Erfolg!");
        }
        if (sum == 4) {
            System.out.println("Guter Erfolg!");
        } else {
            System.out.println("Bestanden.");
        }
    }
}
