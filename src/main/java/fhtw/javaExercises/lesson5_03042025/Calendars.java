package fhtw.javaExercises.lesson5_03042025;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendars {
    public static void main(String[] args) {
        printCalendar(2000, 1, 1, 7);
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
            return dayOfWeek.getValue() - 1; // Monday == 0, Sunday == 6
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
        if (!checkDate(year, month, day)) {
            System.out.printf("invalid date (%d.%d.%d)", day, month, year);
            return;
        }

        printDayName(ymd2w(year, month, day));
        System.out.print(", ");
        printMonthName(month);
        System.out.print(" ");
        System.out.print(day);
        printNmberEnding(day);
        System.out.print(" ");
        System.out.println(year);
    }

    public static void printStatistics(int year, int month, int day) {
        if (!checkDate(year, month, day)) {
            System.out.println("invalid date");
            return;
        }

        System.out.println("Statistics for");
        printDate(year, month, day);
        if (isLeap(year)) {
            System.out.printf("%d is a leap year\n", year);
        } else {
            System.out.printf("%d is not a leap year\n", year);
        }

        printMonthName(month);
        System.out.printf(" %d has %d days\n", year, daysInMonth(year, month));

        System.out.printf("it is day %d of %d\n", dayNumber(year, month, day), year);

        System.out.printf("it is in week %d", weekNumber(year, month, day));
    }

    public static void printCalendar(int year, int month, int day, int highlight) {
        printMonthName(month);
        System.out.println(" " + year);
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        printPadding(year, month, day);

        for (int i = 1; i <= daysInMonth(year, month); i++) {
            if (i == highlight) {
                if (i > 10) {
                    System.out.printf("<%d>", i);
                } else if (i < 10) {
                    System.out.printf(" <%d>", i);
                }
            } else {
                System.out.printf("%3d ", i);
            }

            if (ymd2w(year, month, i) == 6) {
                System.out.println();
            }
        }
    }

    public static void printPadding(int year, int month, int day) {
        for (int i = 0; i < ymd2w(year, month, day); i++) {
            System.out.print("    ");
        }
    }
}
