/*
 * Name:		Celena Williams
 * Assignment:	Program Quiz 5
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 * Date:		April 30, 2015
 */

public class Stored {
    private static String listName ="default";

    public Stored () {
        this.listName = "Name of Lists";
    }//END public Stored ()

    public void setName (String newName) {
        this.listName = newName;
    }//END public void setName (String newName)

    public static void printListName () {
        System.out.println (listName);
    }//END public static void printListName ()
}//END public class Stored