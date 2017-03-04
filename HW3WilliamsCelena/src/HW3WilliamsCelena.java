import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class HW3WilliamsCelena extends JFrame implements ActionListener {
    private static JButton board [] [] = new JButton [3] [3];
    private static String userMark, computerMark;//creates the markers
    private static int user = 0, computer = 0, tie = 0;//creates the scores

    public static void main (String [] args) {
        HW3WilliamsCelena application = new HW3WilliamsCelena ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    public HW3WilliamsCelena () {
        //allows the buttons to be in the tictactoe pattern
        setLayout (new GridLayout (3, 3));
        //allows the user to choose their own marker
        userMark = JOptionPane.showInputDialog ("Enter any symbol for YOU");
        //allows the user to choose the computer's marker
        computerMark = JOptionPane.showInputDialog ("Enter any symbol for ME");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                //creates the buttons for the board
                board [row] [col] = new JButton ("");
                add (board [row] [col]);//adds the buttons to the frame

                //allows the implementation of the actionPerformed method 
                //within the constructor
                final int row1 = row, col1 = col;
                //the integers must be final in order to be used below

                //enables the computer moves
                board [row] [col].addActionListener (this);
                //allows the user to move
                board [row] [col].addActionListener (
                        new ActionListener () {
                            @SuppressWarnings("deprecation")
                            public void actionPerformed (ActionEvent e) {
                                if (board [row1] [col1].getLabel ().equals (""))
                                    board [row1] [col1].setLabel (userMark);
                            }//END public void actionPerformed (ActionEvent e)
                        }//END new ActionListener ()
                );//END addActionListener
            }//END for (int col = 0; col < 3; col++)
        }//END for (int row = 0; row < 3; row++)
        setSize (500, 500);
        setVisible (true);
        //displays the scores to the user
        setTitle ("You: " + user + " Me: " + computer + " Ties: " + tie);
    }//END public HW3WilliamsCelena ()

    public void actionPerformed (ActionEvent e) {
        if (userWins (userMark)) {		
            JOptionPane.showMessageDialog (null, "You win!", "You win!", 
                                           JOptionPane.PLAIN_MESSAGE);
            user++;
            disableButtons ();
            int option = JOptionPane.showConfirmDialog (null, 
                                                "Would you like to play again?",
                                                "Play Again?", 
                                                JOptionPane.YES_NO_OPTION);

            if (option == 0)
                enableButtons ();
            else
                System.exit (0);

            setTitle ("You: " + user + " Me: " + computer + " Ties: " + tie);
        }//END if (userWins (userMark))
        else {
            computerMoves ();

            if (userWins (computerMark)) {
                JOptionPane.showMessageDialog (null, "I win!", "I win!", 
                                               JOptionPane.PLAIN_MESSAGE);
                computer++;
                disableButtons ();

                int option = JOptionPane.showConfirmDialog (null, 
                                                "Would you like to play again?",
                                                "Play Again?", 
                                                JOptionPane.YES_NO_OPTION);

                if (option == 0)
                    enableButtons ();
                else
                    System.exit (0);

                setTitle("You: " + user + " Me: " + computer + " Ties: " + tie);
            }//END if (userWins (computerMark))
        }//END else

        //if the board ties
        if (!userWins (userMark) && !userWins (computerMark) && tie ()) {
            JOptionPane.showMessageDialog (null, "It's a tie!", "It's a tie!", 
                                           JOptionPane.PLAIN_MESSAGE);
            tie++;
            disableButtons ();

            int option = JOptionPane.showConfirmDialog (null, 
                                                "Would you like to play again?", 
                                                "Play Again?", 
                                                JOptionPane.YES_NO_OPTION);

            if (option == 0)
                enableButtons ();
            else
                System.exit (0);

            setTitle ("You: " + user + " Me: " + computer + " Ties: " + tie);
        }//END if (!userWins (userMark) && !userWins (computerMark) && tie ())
    }//END public void actionPerformed (ActionEvent e)

    //enables the buttons
    @SuppressWarnings("deprecation")
    private static void enableButtons () {
        JButton buttons;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons = board [row] [col];
                buttons.setLabel ("");
                buttons.setEnabled (true);
            }//END for (int col = 0; col < 3; col++)
        }//END for (int row = 0; row < 3; row++)
    }//END private static void enableButtons ()

    //disables the buttons
    private static void disableButtons () {
        JButton buttons;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons = board [row] [col];
                buttons.setEnabled (false);
            }//END for (int col = 0; col < 3; col++)
        }//END for (int row = 0; row < 3; row++) 
    }//END private static void disableButtons ()

    //moves the computer in a typical way
    @SuppressWarnings("deprecation")
    private static void computerMoves () {
        JButton buttons;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons = board [row] [col];

                if (buttons.getLabel ().equals ("")) {
                    buttons.setLabel (computerMark);
                    return;
                }//END if (buttons.getLabel ().equals (""))
            }//END for (int col = 0; col < 3; col++)
        }//END for (int row = 0; row < 3; row++)
    }//END private static void computerMoves ()

    //checks for a tie
    @SuppressWarnings("deprecation")
    private static boolean tie () {
        return
        (!board [0] [0].getLabel().equals ("") &&
         !board [0] [1].getLabel().equals ("") &&
         !board [0] [2].getLabel().equals ("")) &&

        (!board [1] [0].getLabel().equals ("") &&
         !board [1] [1].getLabel().equals ("") &&
         !board [1] [2].getLabel().equals ("")) &&

        (!board [2] [0].getLabel().equals ("") &&
         !board [2] [1].getLabel().equals ("") &&
         !board [2] [2].getLabel().equals ("")) &&

        (!board [0] [0].getLabel().equals ("") &&
         !board [1] [0].getLabel().equals ("") &&
         !board [2] [0].getLabel().equals ("")) &&

        (!board [0] [1].getLabel().equals ("") &&
         !board [1] [1].getLabel().equals ("") &&
         !board [2] [1].getLabel().equals ("")) &&

        (!board [0] [2].getLabel().equals ("") &&
         !board [1] [2].getLabel().equals ("") &&
         !board [2] [2].getLabel().equals ("")) &&

        (!board [0] [0].getLabel().equals ("") &&
         !board [1] [1].getLabel().equals ("") &&
         !board [2] [2].getLabel().equals ("")) &&

        (!board [2] [0].getLabel().equals ("") &&
         !board [1] [1].getLabel().equals ("") &&
         !board [0] [2].getLabel().equals (""));
    }//END private static boolean tie ()

    //checks which player wins
    @SuppressWarnings("deprecation")
    private static boolean userWins (String mark) {
        return
        (board [0] [0].getLabel().equals (mark) &&
         board [0] [1].getLabel().equals (mark) &&
         board [0] [2].getLabel().equals (mark)) ||

        (board [1] [0].getLabel().equals (mark) &&
         board [1] [1].getLabel().equals (mark) &&
         board [1] [2].getLabel().equals (mark)) ||

        (board [2] [0].getLabel().equals (mark) &&
         board [2] [1].getLabel().equals (mark) &&
         board [2] [2].getLabel().equals (mark)) ||

        (board [0] [0].getLabel().equals (mark) &&
         board [1] [0].getLabel().equals (mark) &&
         board [2] [0].getLabel().equals (mark)) ||

        (board [0] [1].getLabel().equals (mark) &&
         board [1] [1].getLabel().equals (mark) &&
         board [2] [1].getLabel().equals (mark)) ||

        (board [0] [2].getLabel().equals (mark) &&
         board [1] [2].getLabel().equals (mark) &&
         board [2] [2].getLabel().equals (mark)) ||

        (board [0] [0].getLabel().equals (mark) &&
         board [1] [1].getLabel().equals (mark) &&
         board [2] [2].getLabel().equals (mark)) ||

        (board [2] [0].getLabel().equals (mark) &&
         board [1] [1].getLabel().equals (mark) &&
         board [0] [2].getLabel().equals (mark));
    }//END private static boolean userWins (String mark)
}//END public class HW3WilliamsCelena