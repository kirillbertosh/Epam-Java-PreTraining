package taks1;

import taks1.massCalculator.MassConverter;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Mass in tons = " + MassConverter.convertKilogramToTon(130.6));
        System.out.println("Mass in grams = " + MassConverter.convertKilogramsToGrams( 248));
        System.out.println("Mass in milligrams = " + MassConverter.convertKilogramToMilligram(496.5));
    }
}
