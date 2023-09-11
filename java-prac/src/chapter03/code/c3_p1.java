package chapter03.code;

import java.util.Scanner;

class c3_p1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int x = scnr.nextInt();
        
        if ((x > 0) && (x < 10)) {
                System.out.println("positive single digit number.");
            }

        scnr.close();
    }
}
