/*
 * Name:		Celena Williams
 * Assignment:	Program 5
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 * Date:		April 23, 2015
 */

import java.io.*;
import javax.swing.*;

public class FileSystem {
    public static void saveFile () {
        try {
            //allows file to rewrite anything within file, starting at index 0
            HW5WilliamsCelena.file.seek (0);
            //allows the user to use any character, using the UTF 8 characters
            HW5WilliamsCelena.file.writeUTF
                                        (HW5WilliamsCelena.textArea.getText ());
            
        }//END try
        catch (IOException ioException) {
            JOptionPane.showMessageDialog (null, "Error Writing to File", 
                                           "Error Writing to File",
                                           JOptionPane.ERROR_MESSAGE);
        }//END catch (IOException ioException)
    }//END public static void saveFile ()

    public static void createNewFile () {
        //allows the user to choose files
        JFileChooser fileChooser = new JFileChooser ();
        //allows the user to only choose files, not directories
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showSaveDialog (null);

        if (result == JFileChooser.CANCEL_OPTION)
            return;

        //creates the file the user types
        HW5WilliamsCelena.fileName = fileChooser.getSelectedFile ();

        if (HW5WilliamsCelena.fileName == null || 
            HW5WilliamsCelena.fileName.getName ().equals (""))
            JOptionPane.showMessageDialog (null, "Invalid File Name", 
                                           "Invalid File Name",
                                           JOptionPane.ERROR_MESSAGE);
        else {
            try {
                //creates the file
                HW5WilliamsCelena.file = new RandomAccessFile 
                                             (HW5WilliamsCelena.fileName, "rw");
            }//END try
            catch (FileNotFoundException fileNotFoundException) {
                JOptionPane.showMessageDialog (null, "File Not Found", 
                                               "File Not Found",
                                               JOptionPane.ERROR_MESSAGE);
            }//END catch (FileNotFoundException fileNotFoundException)
        }//END else
    }//END public static void createNewFile ()

    public static void openFile () {
        //allows the user to choose files
        JFileChooser fileChooser = new JFileChooser ();
        //allows the user to only choose files, not directories
        fileChooser.setFileSelectionMode (JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog (null);

        if (result == JFileChooser.CANCEL_OPTION)
            return;

        //selects the file the user selects 
        HW5WilliamsCelena.fileName = fileChooser.getSelectedFile ();

        if (HW5WilliamsCelena.fileName == null || 
            HW5WilliamsCelena.fileName.getName ().equals (""))
            JOptionPane.showMessageDialog (null, "Invalid File Name", 
                                           "Invalid File Name",
                                           JOptionPane.ERROR_MESSAGE);
        else {
            try {
                //opens the file
                HW5WilliamsCelena.file = new RandomAccessFile 
                                             (HW5WilliamsCelena.fileName, "rw");
                //allows the user to see the text in the file
                HW5WilliamsCelena.textArea.setText 
                                            (HW5WilliamsCelena.file.readUTF ());
            }//END try
            catch (IOException ioException) {
                JOptionPane.showMessageDialog (null, "Error Reading File", 
                                               "Error Reading File",
                                               JOptionPane.ERROR_MESSAGE);
            }//END catch (IOException ioException)
        }//END else
    }//END public static void openFile ()
}//END public class FileSystem