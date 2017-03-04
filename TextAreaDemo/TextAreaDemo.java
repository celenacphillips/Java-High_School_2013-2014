//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame {
    private JTextArea textArea1, textArea2;
    private JButton copyButton;

    public TextAreaDemo () {
        super ("TextArea Demo");

        Box box = Box.createHorizontalBox ();

        String string = "This is a demo string to\n" + 
                        "illustrate copyting text\nfrom one textarea to \n" + 
                        "another textarea using an\nexternal event\n";

        textArea1 = new JTextArea (string, 10, 15);
        box.add (new JScrollPane (textArea1));

        copyButton = new JButton ("Copy >>>");
        box.add (copyButton);
        copyButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    textArea2.setText (textArea1.getSelectedText ());
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END copyButton.addActionListener 

        textArea2 = new JTextArea (10, 15);
        textArea2.setEditable (false);
        box.add (new JScrollPane (textArea2));

        Container container = getContentPane ();
        container.add (box);

        setSize (425, 200);
        setVisible (true);
    }//END public TextAreaDemo ()

    public static void main (String [] args) {
        TextAreaDemo application = new TextAreaDemo ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class TextAreaDemo