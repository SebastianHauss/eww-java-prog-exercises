package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter price: ");
        int price = sc.nextInt();

        System.out.print("enter quality: ");
        int quality = sc.nextInt();

        if (isHighPrice(price)) {
            System.out.println("high price");
        } else {
            System.out.println("low price");
        }
        if (isHighQuality(quality)) {
            System.out.println("high quality");
        } else {
            System.out.println("low quality");
        }

        if (isJunk(quality, price)) {
            System.out.println("junk");
        } else if (isRipOff(quality, price)) {
            System.out.println("rip off");
        } else if (isBargain(quality, price)) {
            System.out.println("bargain");
        } else if (isLuxury(quality, price)) {
            System.out.println("luxury");
        }
    }

    public static boolean isHighPrice(int price) {
        return price >= 50;
    }

    public static boolean isHighQuality(int quality) {
        return quality >= 50;
    }

    public static boolean isJunk(int quality, int price) {
        return !isHighQuality(quality) && !isHighPrice(price);
    }

    public static boolean isRipOff(int quality, int price) {
        return !isHighQuality(quality) && isHighPrice(price);
    }

    public static boolean isBargain(int quality, int price) {
        return isHighQuality(quality) && !isHighPrice(price);
    }

    public static boolean isLuxury(int quality, int price) {
        return isHighQuality(quality) && isHighPrice(price);
    }
}
