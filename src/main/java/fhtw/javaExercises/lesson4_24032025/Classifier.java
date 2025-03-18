package fhtw.javaExercises.lesson4_24032025;

import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter price: ");
        int price = sc.nextInt();

        System.out.print("enter quality: ");
        int quality = sc.nextInt();

        boolean highPrice = isHighPrice(price);
        boolean highQuality = isHighQuality(quality);

        System.out.println(highPrice ? "high price" : "low price");
        System.out.println(highQuality ? "high quality" : "low quality");

        if (!highQuality && !highPrice) {
            System.out.println("junk");
        }
        if (!highQuality && highPrice) {
            System.out.println("rip off");
        }
        if (highQuality && !highPrice) {
            System.out.println("bargain");
        }
        if (highQuality && highPrice) {
            System.out.println("luxury");
        }

        sc.close();
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
