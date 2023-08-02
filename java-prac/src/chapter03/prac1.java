package chapter03;

import java.util.Scanner;

class prac1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int x = scnr.nextInt();
        
        if ((x > 0) && (x < 10)) {
                System.out.println("positive single digit number.");
            }

        scnr.close();
    }
}
