/*
 *Name:			Celena Williams
 *Assignment:	Program Quiz 4
 *Semester:		Spring 2015
 *School:		USC Sumter
 *Class:		CSCE 145
 *Date:			April 9, 2015 
 */

public class PQ4WilliamsCelena {
    private static Person person = new Person ();//creates a Person object
    private static Student student = new Student ();//creates a Student object

    public static void main (String [] args) {
        //calls the overridden method from each class and displays
        System.out.println (person.toString ());
        System.out.println (student.toString ());
    }//END public static void main (String [] args)
}//END public class PQ4WilliamsCelena