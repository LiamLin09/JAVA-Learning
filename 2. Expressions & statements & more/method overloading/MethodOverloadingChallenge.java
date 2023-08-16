public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " +convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int heightInInch) {
        return heightInInch * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightRemaining) {
//        return convertToCentimeters((heightInFeet * 12) + heightRemaining);
        int feetToInch = heightInFeet * 12;
        int totalInch = feetToInch + heightRemaining;
        return convertToCentimeters(totalInch);
    }
}
