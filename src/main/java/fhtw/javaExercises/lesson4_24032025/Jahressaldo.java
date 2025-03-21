package fhtw.javaExercises.lesson4_24032025;

import java.util.Arrays;
import java.util.Scanner;

public class Jahressaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] monatssalden = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.printf("%s %d: ", "Monat", i + 1);
            monatssalden[i] = sc.nextDouble();
            if (monatssalden[i] == 0) {
                System.out.println("Nullsummenspiel.");
            }
        }

        double jahressaldo = 0;
        for (double s : monatssalden) {
            jahressaldo += s;
        }

        double maxSaldo = Arrays.stream(monatssalden).max().getAsDouble();
        double minSaldo = Arrays.stream(monatssalden).min().getAsDouble();

        System.out.printf("%s: %.2f\n", "Jahressaldo", jahressaldo);
        System.out.printf("%s: %.2f\n", "Groesster Saldo", maxSaldo);
        System.out.printf("%s: %.2f\n", "Niedrigster Saldo", minSaldo);
    }
}
