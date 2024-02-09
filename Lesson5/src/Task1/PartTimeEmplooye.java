package Task1;

public class PartTimeEmplooye implements Employee {

    String name;
    int ID;
    int hourlyRate;
    int hoursWorked;


    public PartTimeEmplooye(String name, int ID, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.ID = ID;
        this.hourlyRate=hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked*hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println(" Employee name: " + name);
        System.out.println(" Employee ID: " + ID);
        System.out.println(" Hourly Rate: " + hourlyRate);
        System.out.println(" Hours Worked: " + hoursWorked);
    }
}
