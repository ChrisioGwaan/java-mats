package chapter06.oosd;

/*
 * The CasualEmployee subclass
 */

class CasualEmployee extends Employee {
    private double hourlySalary;
    private double overtimeRate;
    final private int OVERTIME_START = 36; // Overtime paid starting from 36 hours and the value cannot be changed

    public CasualEmployee(int ID, String name, String employeeType, double hourlyworked, double hourlySalary, double overtimeRate) {
        super(ID, name, employeeType, hourlyworked);
        this.hourlySalary = hourlySalary;
        this.overtimeRate = overtimeRate;
    }

    public double getHourlySalary() {
        return this.hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getOvertimeRate() {
        return this.overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        // TODO: Implement an algorithm to calculate the salary for casual employee
        // The algorithm is to use hourlySalary * hourlyworked to calculate the salary
        // if the hourlyworked is less than or equal to 36 hours
        // return the calculated salary = hourlySalary * hourlyworked
        // if the hourlyworked is more than 36 hours
        // return the calculated salary = hourlySalary * OVERTIME_START + (hourlyworked - OVERTIME_START) * overtimeRate
        return 0;
    }
}