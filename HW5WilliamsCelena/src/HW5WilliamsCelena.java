/*
 * Name:		Celena Williams
 * Assignment:	Program 5
 * Semester:	Spring 2015
 * School:		USC Sumter
 * Class:		CSCE 145
 * Date:		April 23, 2015
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class HW5WilliamsCelena extends JFrame {
    static JTextArea textArea;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem saveMenuItem, openMenuItem, createNewMenuItem;

    static File fileName;
    static RandomAccessFile file;

    public static void main (String [] args) {
        HW5WilliamsCelena application = new HW5WilliamsCelena ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    public HW5WilliamsCelena () {
        setResizable (false);
        setLayout (new BorderLayout ());

        menuBar = new JMenuBar ();
        menu = new JMenu ("Menu");

        //creates the save menu item
        saveMenuItem = new JMenuItem ("Save...");
        saveMenuItem.setEnabled (false);
        saveMenuItem.addActionListener ((ActionEvent e) -> {
            createNewMenuItem.setEnabled (true);
            saveMenuItem.setEnabled (true);
            FileSystem.saveFile ();
        });//END saveMenuItem.addActionListener ((ActionEvent e)

        //creates the open menu item
        openMenuItem = new JMenuItem ("Open...");
        openMenuItem.addActionListener ((ActionEvent e) -> {
            createNewMenuItem.setEnabled (false);
            saveMenuItem.setEnabled (true);
            textArea.setEditable (true);
            FileSystem.openFile ();
            setTitle (fileName.toString ());
        });//END openMenuItem.addActionListener ((ActionEvent e)
        openMenuItem.setEnabled (true);

        //creates the create new menu item
        createNewMenuItem = new JMenuItem ("Create New...");
        createNewMenuItem.addActionListener ((ActionEvent e) -> {
            createNewMenuItem.setEnabled (false);
            saveMenuItem.setEnabled (true);
            textArea.setEditable (true);
            textArea.setText ("");
            FileSystem.createNewFile ();
            setTitle (fileName.toString ());
        });//END createNewMenuItem.addActionListener ((ActionEvent e)
        createNewMenuItem.setEnabled (true);

        setJMenuBar (menuBar);
        menuBar.add (menu);
        menu.add (saveMenuItem);
        menu.add (createNewMenuItem);
        menu.add (openMenuItem);

        textArea = new JTextArea ();
        textArea.setEditable (false);
        add (textArea, BorderLayout.CENTER);

        setSize (500, 500);
        setVisible (true);
    }//END public HW5WilliamsCelena ()
}//END public class HW5WilliamsCelena