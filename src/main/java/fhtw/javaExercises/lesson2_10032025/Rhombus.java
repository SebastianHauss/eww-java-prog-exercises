package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.print("d: ");
        int d = sc.nextInt();

        System.out.print("e: ");
        double e = sc.nextDouble();

        String num = "012345678901234567890123";
        System.out.println(num);
        System.out.println();
        System.out.printf("%d          /\\          %d\n", a, b);
        System.out.println("          /  \\          ");
        System.out.println("         /    \\          ");
        System.out.printf("        | %+.1f |\n", e);
        System.out.println("         \\    /");
        System.out.println("          \\  /");
        System.out.printf("%d          \\/          %d", c, d);
    }
}

