package taks1.massCalculator;

public class MassConverter {
    
    public static final int GRAMS_IN_KILOGRAM = 1000;
    public static final int MILLIGRAMS_IN_KILOGRAM = 1_000_000;
    public static final int KILOGRAM_IN_TON = 1000;

    public static double convertKilogramsToGrams(double mass) {
        return mass * GRAMS_IN_KILOGRAM;
    }

    public static double convertKilogramToMilligram(double mass) {
        return mass * MILLIGRAMS_IN_KILOGRAM;
    }

    public static double convertKilogramToTon(double mass) {
        return mass / KILOGRAM_IN_TON;
    }
}
