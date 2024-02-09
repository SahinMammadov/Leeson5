package Task1;

public class FullTimeEmployee implements Employee {
    String name;
    int ID;
    double monthSalary;

    public FullTimeEmployee(String name, int ID, double monthSalary) {
        this.name = name;
        this.ID = ID;
        this.monthSalary = monthSalary;
    }
    @Override
    public double calculateSalary() {
        return monthSalary;

    }

    @Override
    public void displayDetails() {
        System.out.println(" Employee name: " + name);
        System.out.println(" Employee ID: " + ID);
    }
}
