public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello RYAN!!!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!!!");
            System.out.println("And I am scared of aliens!!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!!!");
        }

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100!!!");
        }

        if ((topScore > 90) || (secondTopScore < 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true!!!");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen!!!");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is demoestic to our country!!!");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotalValue = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My total value = " + myTotalValue);
        double theRemainder = myTotalValue % 40.00d;
        System.out.println("the remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (isNoRemainder == false) {
            System.out.println("got some remainder!!!!!");
        }
    }
}
