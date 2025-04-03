package fhtw.javaExercises.lesson5_03042025;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendars {
    /**** D O N T  T O U C H  T H I S ***/

    private static Scanner sc = new Scanner(System.in);
    private static final int SET_DATE = 0;
    private static final int IS_LEAP = 1;
    private static final int DAYS_IN_MONTH = 2;
    private static final int CHECK_DATE = 3;

    private static final int YMD_2_W = 7;
    private static final int DAY_NUMBER = 8;
    private static final int WEEK_NUMBER = 9;
//private static final int COMPARE = 10;

    //private static final int DAY_NAME = 13;
//private static final int PRINT_DAY = 14;
//private static final int DAY_SHORT_NAME = 15;
//private static final int PRINT_DAY_SHORT = 16;
//private static final int PRINT_MONTH = 17;
//private static final int PRINT_MONTH_SHORT = 18;
//private static final int PRINT_DATE = 19;
    private static final int PRINT_STATISTICS = 20;

    private static final int PRINT_CALENDAR_HIGHLIGHT = 21;
    private static final int PRINT_CALENDAR = 22;

    private static final int EXIT = 666;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(checkDate(year, month, day));

        while (true) {

            int op;
            System.out.printf("current date: %02d.%02d.%04d\n", day, month, year);

            System.out.printf("enter option: ");
            op = sc.nextInt();

            switch (op) {
                case SET_DATE:
                    System.out.printf("day: ");
                    day = sc.nextInt();
                    System.out.printf("month: ");
                    month = sc.nextInt();
                    System.out.printf("year: ");
                    year = sc.nextInt();
                    break;

                /*------------------------- BASICS ----------------------*/
                case IS_LEAP:
                    System.out.printf("\nisLeap(year): %b\n", isLeap(year));
                    break;

                case DAYS_IN_MONTH:
                    System.out.printf("\ndaysInMonth(year, month): %d\n", daysInMonth(year, month));
                    break;

                case CHECK_DATE:
                    System.out.printf("\ncheckDate1(year): %b\n", checkDate(year));
                    System.out.printf("checkDate2(year, month): %b\n", checkDate(year, month));
                    System.out.printf("checkDate3(year, month, day): %b\n", checkDate(year, month, day));
                    break;

                /*------------------------- CALCULATIONS ----------------------*/
                case YMD_2_W:
                    System.out.printf("\nymd2w(year, month, day): %d\n", ymd2w(year, month, day));
                    break;

                case DAY_NUMBER:
                    System.out.printf("\ndayNumber(year, month, day): %d\n", dayNumber(year, month, day));
                    break;

                case WEEK_NUMBER:
                    System.out.printf("\nweekNumber(year, month, day): %d\n", weekNumber(year, month, day));
                    break;

                /*------------------------- OUTPUT ----------------------*/
                case PRINT_STATISTICS:
                    System.out.printf("\nprintStatistics: ");
                    printStatistics(year, month, day);
                    break;

                /*------------------------- APPLICATIONS ----------------------*/
                case PRINT_CALENDAR_HIGHLIGHT:
                    System.out.printf("\nprintCalendar(year, month, day, 1): \n");
                    printCalendar(year, month, day, 1);
                    break;

                case PRINT_CALENDAR:
                    System.out.printf("\nprintCalendar(year, month, day, 0): \n");
                    printCalendar(year, month, day, 0);
                    break;

                case EXIT:
                    System.out.printf("closing.\n");
                    sc.close();
                    return;

                default:
                    break;
            }
            System.out.printf("\n");
        }
    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
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
                } else return 28;
            default:
                return -1;
        }
    }

    public static boolean checkDate(int year) {
        return year >= 1582 && year <= 2199;
    }

    public static boolean checkDate(int year, int month) {
        if (!checkDate(year)) return false;

        if (year > 1582 && year < 2199) {
            return month >= 1 && month <= 12;
        }
        if (year == 1582) {
            return month >= 10 && month <= 12;
        }
        if (year == 2199) {
            return month >= 1 && month <= 12;
        }
        return false;
    }

    public static boolean checkDate(int year, int month, int day) {
        if (checkDate(year, month)) {

            if (year >= 1583 && year <= 2199) {
                return day >= 1 && day <= daysInMonth(year, month);
            }

            if (year == 1582) {
                if (month == 10) {
                    return day >= 16 && day <= daysInMonth(year, month);
                }
            }
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

        System.out.printf("it is in week %d\n", weekNumber(year, month, day));
    }

    public static void printCalendar(int year, int month, int day, int highlight) {
        printMonthName(month);
        System.out.println(" " + year);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        printPadding(year, month, day);

        for (int i = 1; i <= daysInMonth(year, month); i++) {

            if (highlight == 1) {
                if (i == day) {
                    System.out.printf("<%d>", i);
                }
                if (i != day) {
                    System.out.printf("%3d ", i);
                }

            } else {
                System.out.printf("%3d ", i);
            }

            if (ymd2w(year, month, i) == 6) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printPadding(int year, int month, int day) {
        for (int i = 0; i < ymd2w(year, month, day); i++) {
            System.out.print("    ");
        }
    }
}
