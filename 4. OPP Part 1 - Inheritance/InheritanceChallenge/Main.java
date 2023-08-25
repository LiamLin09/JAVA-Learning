public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee ryan = new SalariedEmployee("Ryan", "03/11/2014", "06/01/2023", 500000);
        System.out.println(ryan);
        System.out.println("Joe's Paycheck = $" + ryan.collectPay());

        ryan.retire();
        System.out.println("Ryan's Pension check = $" + ryan.collectPay());

        HourlyEmployee iris = new HourlyEmployee("Iris", "10/22/1992", "01/15/2021",
                20);
        System.out.println(iris);
        System.out.println("Iris's Paycheck = $" + iris.collectPay());
        System.out.println("Iris's holiday pay = $" + iris.getDoublePay());

    }
}