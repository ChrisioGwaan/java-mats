package chapter06.ans;

import java.util.ArrayList;
import java.util.Scanner;

class FoodMain {
    public static void main(String[] args) {

        // Create a new ArrayList of Food objects called foodList
        ArrayList<Food> foodList = new ArrayList<Food>();
        Scanner scnr = new Scanner(System.in);

        String foodName = "";
        String healthString = "";
        String inputStopString = "";

        double foodCalories = 0;
        int foodQuantity = 0;

        boolean foodHealthStatus = false;
        boolean inputStopBool = true;

        /*
         * The following commented code is not necessary
         * because we can try to avoid duplicated code here (code only inside the while
         * loop)
         * by setting variable inputStopBool into true
         * which also means the program will always enter the first while loop
         */

        // System.out.println("Food name: ");
        // foodName = scnr.next();

        // System.out.println("Calories: ");
        // foodCalories = scnr.nextDouble();

        // System.out.println("Quantity: ");
        // foodQuantity = scnr.nextInt();

        // System.out.println("IsHealth: ");
        // foodHealthStatus = scnr.nextBoolean();

        // System.out.println("Do you wish to add more food? ");
        // inputStop = scnr.nextBoolean();

        while (inputStopBool) {
            System.out.print("Food name: ");
            foodName = scnr.next();
            System.out.println("");

            System.out.print("Calories: ");
            foodCalories = scnr.nextDouble();
            System.out.println("");

            System.out.print("Quantity: ");
            foodQuantity = scnr.nextInt();
            System.out.println("");

            System.out.print("IsHealth: ");
            healthString = scnr.next();
            foodHealthStatus = isTextYes(healthString);
            System.out.println("");

            System.out.print("Do you wish to add more food? ");
            inputStopString = scnr.next();
            System.out.println("");

            // add a new object with info into ArrayList
            foodList.add(new Food(foodName, foodCalories, foodQuantity, foodHealthStatus));

            inputStopBool = isTextYes(inputStopString);
        }

        // Call printFood function from Food class
        for (int i = 0; i < foodList.size(); i++) {
            Food tempFood = foodList.get(i);

            tempFood.printFood();
        }

        foodList.clear(); // Clear ArrayList
        scnr.close(); // Close scnr object
    }

    public static boolean isTextYes(String userInput) {
        if (userInput.equals("Yes") || userInput.equals("YES") ||
                userInput.equals("y") || userInput.equals("Y") ||
                userInput.equals("yes")) {

            return true;
        }

        return false;
    }
}
