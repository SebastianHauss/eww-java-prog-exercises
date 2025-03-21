package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class Notenstatistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Noteneingabe:");

        double sum = 0;
        int count = 0;
        int fuenfer = 0;

        while (true) {
            int grade = sc.nextInt();

            if (grade == 0) {
                break;
            }

            if (grade < 1 || grade > 5) {
                System.out.println("Falsche Eingabe!");
                continue;
            }

            if (grade == 5) {
                fuenfer++;
            }
            count++;
            sum += grade;
        }

        System.out.printf("%s: %.2f\n", "Notendurchschnitt", sum / count);
        System.out.println("Anzahl Fuenfer: " + fuenfer);
    }
}
