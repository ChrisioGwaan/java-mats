package chapter06.oosd;
/*
 * The Employee class
 */

// @Entity
public class Employee implements CalculateStrategy {

    // @Id
    private int id;
    private String name;
    private String employeeType;
    private double hourlyworked; // To record the hours worked by the employee

    public Employee(int id, String name, String employeeType, double hourlyworked) {
        this.id = id;
        this.name = name;
        this.employeeType = employeeType;
        this.hourlyworked = hourlyworked;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double getHourlyworked() {
        return this.hourlyworked;
    }

    public void setHourlyworked(double hourlyworked) {
        this.hourlyworked = hourlyworked;
    }

    @Override
    public double calculateSalary() {
        // TODO: Implement an algorithm to call calculateSalary() method based on the
        // type of employee
        return 0;
    }

    // This method is to tranform the data to a string in JSON format
    // For database query
    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Employee Type: " + this.employeeType + " Hourly Worked: "
                + this.hourlyworked;
    }
}