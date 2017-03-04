import java.util.Scanner;

/*
 * Name:		Celena Williams
 * Assignment:	Programming Quiz 1
 * Class:		CSCE 145
 * Semester:	Spring 2015
 * School:		USC Sumter
 */

public class PQ1WilliamsCelena {
    public static void main (String [] args) {
        System.out.print("Type in your age and press ENTER:\t");

        //Added, suggested by Eclipse, to prevent resource leak
        @SuppressWarnings ("resource")
        Scanner ageScanner = new Scanner (System.in);
        int age = ageScanner.nextInt ();

        if (age < 18) {
            System.out.println ("You are too young. This program will now" + 
                                " terminate.");
            System.exit(0);
        }//END if (age < 18)
        else {
            System.out.println ("Since you are older than or equal to 18 years "
                              + "of age, I will count your age from now " 
                              + "until your first birthday.");

            while (1 <= age) {
                System.out.println (age);
                age--;//Subtracts 1 from age
            }//END wihile (1 <= age)
            System.out.println ("Now this program will terminate.");
            System.exit(0);
        }//END else
    }//END public static void main (String [] args)
}//END public class PQ1WilliamsCelena