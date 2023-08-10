package chapter06.oosd;

class ContractEmployee extends Employee {
    private double monthlySalary;

    public ContractEmployee(int ID, String name, String employeeType, double hourlyworked, double monthlySalary) {
        super(ID, name, employeeType, hourlyworked);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        // TODO: Implement an algorithm to calculate the salary for contract employee
        // Direct access the monthlySalary field
        // Return the calculated salary according to the algorithm
        return 0;
    }
}