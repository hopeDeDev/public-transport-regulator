// Comment out the Scanner.java file to successfully run the program


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("How many people?");
        int numPpl = obj.nextInt();
        System.out.println("How many passengers?");
        int numPasseng = obj.nextInt();

        if (numPpl <= 200 && numPasseng <= 15) {
            System.out.println("We are ready to vay!");

        }

    }
}

