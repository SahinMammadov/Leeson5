package Task1;

import Task1.FullTimeEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee("Shahin", 1, 2500);
        employees[1] = new FullTimeEmployee("Nigar", 2, 1200);
        employees[2] = new FullTimeEmployee("Nicat", 3, 1800);
        employees[3] = new PartTimeEmplooye("Kerim", 4, 15, 20);
        employees[4] = new PartTimeEmplooye("Saleh", 5, 30, 40);

        for (Employee employee : employees) {
            System.out.println("Salary: " + employee.calculateSalary());
            employee.displayDetails();
            System.out.println();
        }
    }
}
