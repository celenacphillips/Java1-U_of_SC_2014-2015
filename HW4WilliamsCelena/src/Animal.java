/*
 * Name:		Celena Williams
 * Assignment:	Program 4
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 */

import javax.swing.JOptionPane;

public class Animal {
    int walkSpeed;
    String type;

    public Animal () {
        int walk = Integer.parseInt
                (JOptionPane.showInputDialog    
                                ("Please input an integer for the walk speed"));

        setWalk (walk);
            setType ("animal");
    }//END public Animal ()

    public void setWalk (int newWalkSpeed) {
        this.walkSpeed = newWalkSpeed;
    }//END public void setWalk (int newWalkSpeed)

    public void setType (String newType) {
        this.type = newType;
    }//END public void setType (String newType)

    public String getMove () {
        return "walks " + this.walkSpeed;
    }//END public String getMove ()

    public String getSkin () {
        return "an epidermis";
    }//END public String getSkin ()

    public String getMessage () {
        return "The " + this.type + " has " + getSkin () + " and " + 
               getMove () + ".";
    }//END public String getMessage ()
}//END public class Animal