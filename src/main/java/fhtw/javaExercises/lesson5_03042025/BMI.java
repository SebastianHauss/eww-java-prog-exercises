package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("weight [kg]: ");
        double weight = sc.nextDouble();

        System.out.print("height [m]: ");
        double height = sc.nextDouble();

        double bmi = bmiCalc(height, weight);
        int bmiCategory = bmiCategory(bmi);

        System.out.printf("m=%.2fkg h=%.2fm -> BMI=%.2f ", weight, height, bmi);
        bmiMessage(bmiCategory);
    }

    public static double bmiCalc(double height, double weight) {
        if (height < 1.6 || weight < 40) {
            return -1;
        }
        return weight / Math.pow(height, 2);
    }

    public static int bmiCategory(double bmi) {
        if (bmi == -1) {
            return -1;
        }

        if (bmi < 15) {
            return 10;
        } else if (bmi >= 15 && bmi < 16) {
            return 11;
        } else if (bmi >= 16 && bmi < 18.50) {
            return 12;
        } else if (bmi >= 18.50 && bmi < 25) {
            return 20;
        } else if (bmi >= 25 && bmi < 30) {
            return 30;
        } else if (bmi >= 30 && bmi < 35) {
            return 40;
        } else if (bmi >= 35 && bmi < 40) {
            return 41;
        } else {
            return 42;
        }
    }

    public static void bmiMessage(int bmiCategory) {
        switch (bmiCategory) {
            case -1:
                System.out.println("invalid");
                break;
            case 10:
                System.out.println("(Very severely underweight)");
                break;
            case 11:
                System.out.println("(Severely underweight)");
                break;
            case 12:
                System.out.println("(Underweight)");
                break;
            case 20:
                System.out.println("(Normal)");
                break;
            case 30:
                System.out.println("(Overweight)");
                break;
            case 40:
                System.out.println("Moderately obese");
                break;
            case 41:
                System.out.println("(Severely obese)");
                break;
            case 42:
                System.out.println("(Very severely obese)");
                break;
        }
    }
}
