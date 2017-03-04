/*
 * Name:		Celena Williams
 * Assignment:	Program 4
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 */

public class Fish extends Animal {
    int swimSpeed;

    public Fish () {
        super ();
        setType ("fish");
        this.swimSpeed = this.walkSpeed / 4;
    }//END public Fish ()

    public String getMove () {
        return "swims " + swimSpeed;
    }//END public String getMove ()

    public String getSkin () {
        return "scales";
    }//END public String getSkin ()
}//END public class Fish