package fhtw.javaExercises.lesson5_03042025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Float> arr = new ArrayList<>();

        System.out.println("Max. 16 Werte eingeben, 0 beendet:");

        for (int i = 0; i < 16; i++) {
            float input = sc.nextFloat();
            if (input == 0) {
                break;
            }
            if (input < -100) {
                arr.add(-100f);
            } else {
                arr.add(input);
            }
        }

        System.out.printf("%s: %d", "Eingelesen", arr.size());
        System.out.println();
        System.out.print("N: ");
        int n = sc.nextInt();
        if (n > arr.size()) {
            System.out.println("Zu wenige Werte");
            return;
        }
        List<Float> tail = arr.subList(arr.size() - n, arr.size());

        float sum = 0;
        int count = 0;
        for (float f : tail) {
            sum += f;
            count++;
        }
        float mean = sum / count;
        System.out.printf("%s = %.2f", "Wert", mean);
    }

}
