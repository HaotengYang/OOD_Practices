public class Employee {
    private String name;
    private String id;
    private double hoursWorked;
    private double payRate;

    public Employee(String name, String id, double payRate) {
        this.name = name;
        this.id = id;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public void addHoursWorked(double hours) {
        this.hoursWorked = Math.max(0, this.hoursWorked + hours);
    }

    public void resetHoursWorked() {
        this.hoursWorked = 0;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public Paycheck getWeeklyCheck() {
        return new Paycheck(this.payRate, this.hoursWorked);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nID: " + this.id + "\nPayment after taxes: $ " + String.format("%.2f", getWeeklyCheck().getPayAfterTaxes());
    }
}
