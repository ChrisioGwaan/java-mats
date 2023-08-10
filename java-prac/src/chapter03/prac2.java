package chapter03;

import java.util.Scanner;

class prac2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int a, b, c, n;

        a = scnr.nextInt();
        b = scnr.nextInt();
        c = scnr.nextInt();
        n = scnr.nextInt();

        if (n <= 2) {
            System.out.println("Formula is not suitable at this stage.");
        } else {
            if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                System.out.println("Holy smokes, fermat was wrong!");
            } else {
                System.out.println("No, that doesn't work.");
            }
        }

        scnr.close();
    }
}






