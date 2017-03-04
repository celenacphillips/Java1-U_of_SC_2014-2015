/*
 *Name:			Celena Williams
 *Assignment:	Program Quiz 4
 *Semester:		Spring 2015
 *School:		USC Sumter
 *Class:		CSCE 145
 *Date:			April 9, 2015 
 */

public class Student extends Person {
    //overrides the toString () method from the Object class
    public String toString () {
        super.toString();//calls the superclass constructor method
        return "I am a STUDENT but I am also a PERSON.";
    }//END public String toString ()
}//END public class Student