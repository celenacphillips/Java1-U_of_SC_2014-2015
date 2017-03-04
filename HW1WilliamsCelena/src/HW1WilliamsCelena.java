import java.util.Scanner;

/*
 * Name:		Celena Williams
 * Assignment:	Homework1
 * Class:		CSCE 145
 * Semester:	Spring 2015
 * School:		USC Sumter
 */

public class HW1WilliamsCelena {
    public static void main (String [] args) {
        System.out.print ("Type in a letter grade and press ENTER:\t");

        //Added, suggested by Eclipse, to prevent resource leak
        @SuppressWarnings ("resource")
        Scanner grade = new Scanner (System.in);
        String letterGrade = grade.next ();
        letterGrade = letterGrade.toLowerCase ();

        String gradeRange = "";

        switch (letterGrade) {
            case "a":
                gradeRange = "90-100";
                break;
            case "b":
                gradeRange = "80-89";
                break;
            case "c":
                gradeRange = "70-79";
                break;
            case "d":
                gradeRange = "60-69";
                break;
            case "f":
                gradeRange = "0-59";
                break;
            default://If the user input any other character
                System.out.println ("Error! Not a valid grade letter. " + 
                                    "Program terminated.");
                System.exit (0);
        }//END switch (letterGrade)
        System.out.println (gradeRange);

        System.out.println ("\nType three sides of a triangle followed by" + 
                            " ENTER:\n");

        //Added, suggested by Eclipse, to prevent resource leak
        @SuppressWarnings ("resource")
        Scanner sides = new Scanner (System.in);
        int sideA = sides.nextInt ();
        int sideB = sides.nextInt ();
        int sideC = sides.nextInt ();
        String triangle = "";

        if (sideA + sideB > sideC && 
            sideB + sideC > sideA && 
            sideA + sideC > sideB)
            triangle = "a triangle.\nThe perimeter of the triangle is " + 
                       (sideA + sideB + sideC) + ".";
        else
            triangle = "not a triangle.";
        System.out.println ("This is " + triangle);

        String end = "";
        //Added, suggested by Eclipse, to prevent resource leak
        @SuppressWarnings ("resource")
        Scanner sentenceInput = new Scanner (System.in);
        while (!end.equals ("end")) {
            System.out.println ("\nType a sentence, any sentence, and" + 
                                " press ENTER. When done, enter END:");
            String sentence = sentenceInput.nextLine ();
            sentence = sentence.toLowerCase ();

            double numberOfVowels = 0;
            double percentOfVowels = 0;

            if (sentence.equals ("end"))//If the user inputs "end"
                end = "end";
            else {
                for (int i = 0; i < sentence.length (); i++) {
                    char charInSentence = sentence.charAt (i);

                    if (charInSentence == 'a' || charInSentence == 'e' || 
                        charInSentence == 'i' || charInSentence == 'o' || 
                        charInSentence == 'u')//if charInSentence is a vowel
                        numberOfVowels++;
                }//END for (int i = 0; i < sentence.length (); i++)
                percentOfVowels = (numberOfVowels / sentence.length ()) * 100;

                System.out.println ("The number of characters is " + 
                                    sentence.length () + ".\nThe number of " + 
                                    "vowels is " + (int) numberOfVowels + 
                                    ".\nThe percentage of vowels is " + 
                                    percentOfVowels + "%.");
            }//END else
        }//END while (!end.equals ("end"))
        System.out.println ("Program terminated.");
        System.exit (0);
    }//END public static void main (String [] args)
}//END public class HW1WilliamsCelena