/*
 * Name:		Celena Williams
 * Assignment:	Program Quiz 3
 * Class:		CSCE 145
 * Semester:	Spring 2015
 * School:		USC Sumter
 */

import java.util.Scanner;

public class PQ3WilliamsCelena {
    private static int intArray [];//declares an integer array

    public static void main (String [] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner (System.in);

        intArray = new int [5];//sets the size of the integer array to 5

        for (int i = 0; i < 5; i++) {
            System.out.print("For index " + i + ", please enter an integer:\t");
            //sets the value at index i to scan.nextInt ()
            intArray [i] = scan.nextInt ();
        }//END for (int i = 0; i < 5; i++)

        for (int i = 4; i >= 0; i--) {
            if (i == 0)
                //prints the value at index i plus a colon and a space
                System.out.print(intArray [i] + ".");
            else
                //prints the value at index i plus a colon and a space
                System.out.print(intArray [i] + ", ");
        }//END for (int i = 4; i >= 0; i--)
    }//END public static void main (String [] args)
}//END public class PQ3WilliamsCelena