package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Hyperbel {
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

        System.out.println();
        System.out.println("01234567890123456");
        System.out.println("\\               /");
        System.out.printf(" \\  %010d /\n", a);
        System.out.println("  \\           /");
        System.out.printf("%d  | %06.3f |  %d\n", b, e, c);
        System.out.println("  /          \\");
        System.out.printf(" / %010d \\\n", d);
        System.out.println("/              \\");
    }
}
