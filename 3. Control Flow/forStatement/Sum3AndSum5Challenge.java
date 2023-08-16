public class Sum3AndSum5Challenge {
    public static void main(String[] args) {

        int count = 0;
        int sumOfMatch = 0;

        for (int i = 1; count <=5 && i <= 1000; i++) {
            if (i % 3 ==0 && i % 5 == 0) {
                System.out.println(i + " : find a match!!!");
                count++;
                sumOfMatch = sumOfMatch + i;
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatch);
    }
}
