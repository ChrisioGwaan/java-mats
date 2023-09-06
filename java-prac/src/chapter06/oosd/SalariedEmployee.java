package chapter06.oosd;

/*
 * The SalariedEmployee subclass
 */

// @Entity
class SalariedEmployee extends Employee {
    private double monthlySalary;

    // Paid leave hours for salaried employee
    private double paidLeaveHours;

    public SalariedEmployee(int ID, String name, String employeeType, double hourlyworked, double monthlySalary) {
        super(ID, name, employeeType, hourlyworked);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getPaidLeaveHours() {
        return this.paidLeaveHours;
    }

    public void setPaidLeaveHours(double paidLeaveHours) {
        this.paidLeaveHours = paidLeaveHours;
    }

    @Override
    public double calculateSalary() {
        // TODO: Implement an algorithm to calculate the salary for salaried employee
        // Direct access the monthlySalary field
        // Return the calculated salary according to the algorithm
        return 0;
    }
}