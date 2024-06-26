package mextDay2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Hacer", 8000000, 34);

        Salesperson employeeTwo = new Salesperson("Dave", 65000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalery();
        employeeTwo.getComissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());

    }
}
