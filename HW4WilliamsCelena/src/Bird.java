/*
 * Name:		Celena Williams
 * Assignment:	Program 4
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 */

public class Bird extends Animal {
    int flySpeed;

    public Bird () {
        super ();
        setType ("bird");
        this.flySpeed = this.walkSpeed * 4;
    }//END public Bird ()

    public String getMove () {
        return "flies " + flySpeed;
    }//END public String getMove ()

    public String getSkin () {
        return "feathers";
    }//END public String getSkin ()
}//END public class Bird