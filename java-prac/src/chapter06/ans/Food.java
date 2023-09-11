package chapter06.ans;

class Food {

    // Create a private String variable called name
    private String name;

    // Create a private double variable called calories
    private double calories;

    // Create a private int variable called quantity
    private int quantity;

    // Create a private boolean variable called isHealthy
    private boolean isHealthy;

    // Default Constructor, initialise all variables to "", 0, or false
    public Food() {
        name = "";
        calories = 0;
        quantity = 0;
        isHealthy = false;
    }

    // Another Constructor that takes in a String name, double calories, int
    // quantity, and boolean isHealthy
    public Food(String name, double calories, int quantity, boolean isHealthy) {
        this.name = name;
        this.calories = calories;
        this.quantity = quantity;
        this.isHealthy = isHealthy;
    }

    // Getter and Setter Methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getHealthStatus() {
        return this.isHealthy;
    }

    public void setHealthStatus(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public double calculateTotalCalories() {
        return this.quantity * this.calories;
    }

    public void printFood() {
        System.out.println("----------");
        System.out.println("Food name: " + this.name);
        System.out.printf("Calories: %.2f\n", this.calories);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Total Calories: " + calculateTotalCalories());
        System.out.println("IsHealthy: " + this.isHealthy + "\n");
    }
}