package task2;

import task2.round.RoundCalculator;

public class Test2 {

    public static void main(String[] args) throws Exception {
        double firstRadius = 26.4;
        double secondRadius = 14.88;
        System.out.println("Thea area = " + RoundCalculator.countAreaOfRing(firstRadius, secondRadius));
    }
}
