//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopupTest extends JFrame {
    private JRadioButtonMenuItem items [];
    private final Color colorValues [] = {Color.BLUE, Color.YELLOW, Color.RED};
    private JPopupMenu popupMenu;

    public PopupTest () {
        super ("Using JPopupMenus");

        ItemHandler handler = new ItemHandler ();
        String colors [] = {"Blue", "Yellow", "Red"};

        ButtonGroup colorGroup = new ButtonGroup ();
        popupMenu = new JPopupMenu ();
        items = new JRadioButtonMenuItem [3];

        for (int count = 0; count < items.length; count++) {
            items [count] = new JRadioButtonMenuItem (colors [count]);
            popupMenu.add (items [count]);
            colorGroup.add (items [count]);
            items [count].addActionListener (handler);
        }//END for (int count = 0; count < items.length; count++)

        getContentPane ().setBackground (Color.WHITE);

        addMouseListener (
            new MouseAdapter () {
                public void mousePressed (MouseEvent event) {
                    checkForTriggerEvent (event);
                }//END public void mousePressed (MouseEvent event)

                public void mouseReleased (MouseEvent event) {
                    checkForTriggerEvent (event);
                }//END public void mouseReleased (MouseEvent event)

                private void checkForTriggerEvent (MouseEvent event) {
                    if (event.isPopupTrigger ()) {
                        popupMenu.show (event.getComponent (), event.getX (), 
                                        event.getY ());
                    }//END if (event.isPopupTrigger ())
                }//END private void checkForTriggerEvent (MouseEvent event)
            }//END new MouseAdapter ()
        );//END addMouseListener

        setSize (300, 200);
        setVisible (true);
    }//END public PopupTest ()

    public static void main (String [] args) {
        PopupTest application = new PopupTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    private class ItemHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            for (int i = 0; i < items.length; i++) {
                if (event.getSource () == items [i]) {
                    getContentPane ().setBackground (colorValues [i]);
                    return;
                }///END if (event.getSource () == items [i])
            }//END for (int i = 0; i < items.length; i++)
        }//END public void actionPerformed (ActionEvent event)
    }//END private class ItemHandler
}//END public class PopupTest