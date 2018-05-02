package task2.round;

public class RoundCalculator {

    public static double countAreaOfRing(double externalRadius, double interiorRadius) throws Exception {
        if (interiorRadius > externalRadius) {
            throw new Exception("The inner radius can't be greater, than outer radius");
        }
        return (Math.PI * externalRadius * externalRadius) - (Math.PI * interiorRadius * interiorRadius);
    }
}
