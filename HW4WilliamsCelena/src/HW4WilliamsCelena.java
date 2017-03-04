/*
 * Name:		Celena Williams
 * Assignment:	Program 4
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 */

import javax.swing.JOptionPane;

public class HW4WilliamsCelena {
    private static String message = "";
    static Animal animals [] = new Animal [4];

    public static void main (String [] args) {
        animals [0] = new Animal ();
        animals [1] = new Mammal ();
        animals [2] = new Fish ();
        animals [3] = new Bird ();

        for (int i = 0; i < animals.length; i++) {
            message += animals [i].getMessage () + "\n";
        }//END for (int i = 0; i < animals.length; i++)

        JOptionPane.showMessageDialog (null, message);
    }//END public static void main (String [] args)
}//END public class HW4WilliamsCelena