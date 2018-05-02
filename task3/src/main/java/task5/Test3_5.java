package task5;

import task5.date.DateUtil;

public class Test3_5 {

    public static void main(String[] args) {
        int year = 2000;
        int month = 2;
        int day = 28;
        System.out.println("Year = " + year + ", month = " + month + " day = " + day);
        System.out.println("Next day = " +
                DateUtil.getNextDay(year, month, day)[0] + ", " +
                DateUtil.getNextDay(year, month, day)[1] + ", " +
                DateUtil.getNextDay(year, month, day)[2]);
    }
}
