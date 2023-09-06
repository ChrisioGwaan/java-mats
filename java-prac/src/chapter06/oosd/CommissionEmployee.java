package chapter06.oosd;

/*
 * The CommissionEmployee subclass
 */

class CommissionEmployee extends Employee {
    private double baseSalary;
    private double sales;
    final private double commissionRate = 0.3; // 30% as default

    public CommissionEmployee(int ID, String name, String employeeType, double hourlyworked, double baseSalary, double sales) {
        super(ID, name, employeeType, hourlyworked);
        this.baseSalary = baseSalary;
        this.sales = sales;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSales() {
        return this.sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        // TODO: Implement an algorithm to calculate the salary for commission employee
        // The algorithm uses baseSalary and commissionRate to calculate the salary
        // Based on the requirement, the commissionRate is 30% as default
        // Return the salary = baseSalary + sales * commissionRate
        return 0;
    }
}