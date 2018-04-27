package taks1.massCalculator;

public class MassCalculator {

    public static double countInGrams(double mass) {
        return mass * 1000;
    }

    public static double countInMilligrams(double mass) {
        return mass * 1_000_000;
    }

    public static double countInTons(double mass) {
        return mass / 1000;
    }
}
