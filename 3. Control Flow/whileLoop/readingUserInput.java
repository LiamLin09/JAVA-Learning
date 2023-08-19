import java.util.Scanner;

public class readingUserInput {
    public static void main (String[] args) {
        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he is " + ageWithPartialYear);
    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year were you born??");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "so you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("What's your name???");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course");

//        String dateOfBirth = System.console().readLine("What year were you born??");
        System.out.println("What year were you born????");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "so you are " + age + " years old";
    }
}
