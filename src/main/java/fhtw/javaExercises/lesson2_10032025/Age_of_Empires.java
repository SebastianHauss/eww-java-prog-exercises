package fhtw.javaExercises.lesson2_10032025;

import java.util.Scanner;

public class Age_of_Empires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your age: ");
        int age = sc.nextInt();

        // %s: -> %d: , %2s -> ~ , %d -> age ,  ~
        System.out.printf("%s: %2s" + "%d" + "%s", "%d", "~", age, "~\n");

        //%s: -> %+d: , %1s -> ~ , %+d -> +age , ~
        System.out.printf("%s: %1s" + "%+d" + "%s", "%+d", "~", age, "~\n");

        System.out.printf("%s: %2s" + "%d" + "%s", "% d", "~ ", age, "~\n");

        System.out.printf("%s: %-4s" + "%d" + "%s", "%5d", "~", age, "~\n");

        System.out.printf("%s: %s" + "%05d" + "%s", "%05d", "~", age, "~\n");

        System.out.printf("%s: %s" + "%-5d" + "%s", "%-5d", "~", age, "~\n");

        System.out.printf("%s: %2s" + "%#x" + "%s", "%#x", "~", age, "~\n");
    }
}