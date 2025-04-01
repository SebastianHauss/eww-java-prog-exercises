package fhtw.javaExercises.lesson5_03042025;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendars {
    public static void main(String[] args) {
        printNmberEnding(13);
    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0))
                || (year % 400 == 0);
    }

    public static int daysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (isLeap(year)) {
                    return 29;
                } else
                    return 28;
            default:
                return -1;
        }
    }

    public static boolean checkDate(int year) {
        return year >= 1582 && year <= 2199;
    }

    public static boolean checkDate(int year, int month) {
        if (checkDate(year)) {

            if (year == 1582) {
                return month >= 10 && month <= 12;
            }
            if (year == 2199) {
                return month >= 1 && month <= 12;
            }
            return month >= 1 && month <= 12;
        }
        return false;
    }

    public static boolean checkDate(int year, int month, int day) {
        if (checkDate(year, month)) {

            if (year == 1582) {
                if (month == 10) {
                    return day >= 16 && day <= daysInMonth(year, month);
                }
            }
            if (year == 2199) {
                if (month == 12) {
                    return day >= 1 && day <= 31;
                }
            }
            return day >= 1 && day <= daysInMonth(year, month);
        }
        return false;
    }

    public static int ymd2w(int year, int month, int day) {
        if (checkDate(year, month, day)) {
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            return dayOfWeek.getValue(); // Monday == 1, Sunday == 7
        }
        return -1;
    }

    public static int dayNumber(int year, int month, int day) {
        if (!checkDate(year, month, day)) return -1;

        int sum = 0;

        for (int i = 1; i <= month; i++) {
            sum += daysInMonth(year, i);
        }
        return sum - (daysInMonth(year, month) - day);
    }

    public static int weekNumber(int year, int month, int day) {
        if (!checkDate(year, month, day)) return -1;

        if (dayNumber(year, month, day) / 7 == 0) {
            return 1;
        }
        return (dayNumber(year, month, day) / 7);
    }

    public static void printDayName(int day) {
        switch (day) {
            case 0:
                System.out.print("Monday");
                break;
            case 1:
                System.out.print("Tuesday");
                break;
            case 2:
                System.out.print("Wednesday");
                break;
            case 3:
                System.out.print("Thursday");
                break;
            case 4:
                System.out.print("Friday");
                break;
            case 5:
                System.out.print("Saturday");
                break;
            case 6:
                System.out.print("Sunday");
                break;
            default:
                System.out.printf("invalid day (<%d>)", day);
        }
    }

    public static void printMonthName(int month) {
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.printf("invalid day (%d)", month);
        }
    }

    public static void printNmberEnding(int n) {
        String num = String.valueOf(n);

        String numEnding = num.substring(num.length() - 1);

        switch (num) {
            case "11":
                System.out.print("th");
                break;
            case "12":
                System.out.print("th");
                break;
            case "13":
                System.out.print("th");
                break;
        }

        if (!num.equals("11") && !num.equals("12") && !num.equals("13")) {
            switch (numEnding) {
                case "1" -> System.out.print("st");
                case "2" -> System.out.print("nd");
                case "3" -> System.out.print("rd");
                default -> System.out.print("th");
            }
        }
    }

    public static void printDate(int year, int month, int day) {
        printDayName(day);
        System.out.print(", ");
        printMonthName(month);
        System.out.print(" ");
        
    }


}
