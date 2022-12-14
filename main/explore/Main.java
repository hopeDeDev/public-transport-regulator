// Comment out the Scanner.java file to successfully run the program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("How many people?");
        int numPeople = object.nextInt();
        System.out.println("How many passengers?");
        int numPassengers = object.nextInt();


        if (numPeople <= 200 && numPassengers <= 15) {
            System.out.println("We are ready to Go!");
        }
        else if (numPeople > 200 && numPassengers > 15) {
            System.out.println("number of passengers must be lower than 16 and the number of people must be lower than 2001");
        }
        else if (numPeople > 200){            
            System.out.println("number higher than 200 and risk of covid spreading");
        }
        else if (numPassengers >  15){
        System.out.println("passengers are higher than 15 and a high risk of covid spreading");
        }
        else{
            System.out.println("Input correcet values");
        }

    }
}

