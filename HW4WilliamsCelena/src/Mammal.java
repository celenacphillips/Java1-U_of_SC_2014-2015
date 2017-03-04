/*
 * Name:		Celena Williams
 * Assignment:	Program 4
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 */

public class Mammal extends Animal {
    public Mammal () {
        super ();
        setType ("mammal");
    }//END public Mammal ()

    public String getSkin () {
        return "fur";
    }//END public String getSkin ()
}//END public class Mammal