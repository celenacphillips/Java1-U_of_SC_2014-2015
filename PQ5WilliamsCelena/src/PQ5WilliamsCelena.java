/*
 * Name:		Celena Williams
 * Assignment:	Program Quiz 5
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 * Date:		April 30, 2015
 */

import java.util.Scanner;

public class PQ5WilliamsCelena {
    static String list [] = new String [5];

    public static void main (String [] args) {
        Stored store = new Stored ();
        Stored.printListName();

        @SuppressWarnings("resource")
        Scanner scan = new Scanner (System.in);

        System.out.println ("Please enter 5 names, followed by [ENTER]");

        for (int i = 0; i < 5; i++) {
            list [i] = scan.next ();
        }//END for (int i = 0; i < 5; i++)

        for (int i = 0; i < 5; i++) {
            System.out.println (list [i]);
        }//END for (int i = 0; i < 5; i++)
    }//END public static void main (String [] args)
}//END public class PQ5WilliamsCelena