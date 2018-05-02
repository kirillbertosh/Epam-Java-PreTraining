package taks1;

import taks1.massCalculator.MassCalculator;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Mass in tons = " + MassCalculator.countInTons(130.6));
        System.out.println("Mass in grams = " + MassCalculator.countInGrams( 248));
        System.out.println("Mass in milligrams = " + MassCalculator.countInMilligrams(496.5));
    }
}
