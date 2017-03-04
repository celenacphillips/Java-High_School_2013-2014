//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyDemo extends JFrame implements KeyListener {
    private String line1 = "", line2 = "", line3 = "";
    private JTextArea textArea;

    public KeyDemo () {
        super ("Demonstrating Keystroke Events");

        textArea = new JTextArea (10, 15);
        textArea.setText ("Press any key on the keyboard...");
        textArea.setEnabled (false);
        textArea.setDisabledTextColor (Color.BLACK);
        getContentPane ().add (textArea);

        addKeyListener (this);

        setSize (350, 100);
        setVisible (true);
    }//END public KeyDemo ()

    public void keyPressed (KeyEvent event) {
        line1 = "Key pressed: " + event.getKeyText (event.getKeyCode ());
        setLines2and3 (event);
    }//END public void keyPressed (KeyEvent event)

    public void keyReleased (KeyEvent event) {
        line1 = "Key released: " + event.getKeyText (event.getKeyCode ());
        setLines2and3 (event);
    }//END public void keyReleased (KeyEvent event)

    public void keyTyped (KeyEvent event) {
        line1 = "Key typed: " + event.getKeyChar ();
        setLines2and3 (event);
    }//END public void keyTyped (KeyEvent event)

    private void setLines2and3 (KeyEvent event) {
        line2 = "This key is " + (event.isActionKey () ? "" : "not ") + 
                "an action key";

        String temp = event.getKeyModifiersText (event.getModifiers ());

        line3 = "Modifier keys pressed: " + (temp.equals ("") ? "none" : temp);

        textArea.setText (line1 + "\n" + line2 + "\n" + line3 + "\n");
    }//END private void setLines2and3 (KeyEvent event)

    public static void main (String [] args) {
        KeyDemo application = new KeyDemo ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class KeyDemo