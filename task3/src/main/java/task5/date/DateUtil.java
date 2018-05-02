package task5.date;

public class DateUtil {

    private static int[] numberOfDayInMonths = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int[] getNextDay(int year, int month, int day) {
        int[] result = new int[3];
        result[0] = year;
        result[1] = month;
        result[2] = day;
        if (isLeapYear(year)) {
            numberOfDayInMonths[1] = 29;
        }
        if (result[1] == 12 && result[2] == 31) {
            result[0]++;
            result[1] = 1;
            result[2] = 1;
            return result;
        }
        if (day == numberOfDayInMonths[month - 1]) {
            result[1]++;
            result[2] = 1;
            return result;
        }
        result[2]++;
        return result;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 & year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
