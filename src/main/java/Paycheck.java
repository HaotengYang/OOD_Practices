public class Paycheck {
    private double rate;
    private double hoursWorked;
    private double totalPay;

    public Paycheck(double rate, double hoursWorked) {
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.totalPay = hoursWorked <= 40 ? rate * hoursWorked : 40 * rate + (hoursWorked - 40) * rate * 1.5;
    }

    public double getTotalPay() {
        return this.totalPay;
    }

    public double getPayAfterTaxes() {
        return this.totalPay < 400 ? this.totalPay * 0.90 : this.totalPay * 0.85;
    }

    @Override
    public String toString() {
        return "Payment after taxes: $ " + String.format("%.2f", getPayAfterTaxes());
    }
}
