public class LastDigitChecker {
    // write your code here
    public static boolean isValid(int a) {
        if (a < 10 || a > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int lastA = a % 10;
            int lastB = b % 10;
            int lastC = c % 10;
            return ((lastA == lastB) || (lastB == lastC) || (lastC == lastA));
        } else {
            return false;
        }
    }
}