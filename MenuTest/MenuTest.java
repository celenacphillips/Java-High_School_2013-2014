//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame {
    private final Color colorValues [] = {Color.BLACK, Color.BLUE, Color.RED, 
                                          Color.GREEN};
    private JRadioButtonMenuItem colorItems [], fonts [];
    private JCheckBoxMenuItem styleItems [];
    private JLabel displayLabel;
    private ButtonGroup fontGroup, colorGroup;
    private int style;

    public MenuTest () {
        super ("Using JMenus");

        JMenu fileMenu = new JMenu ("File");
        fileMenu.setMnemonic ('F');

        JMenuItem aboutItem = new JMenuItem ("About...");
        aboutItem.setMnemonic ('A');
        fileMenu.add (aboutItem);
        aboutItem.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    JOptionPane.showMessageDialog (MenuTest.this, 
                                           "This is an example\nof using menus", 
                                           "About", JOptionPane.PLAIN_MESSAGE);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END aboutItem.addActionListener

        JMenuItem exitItem = new JMenuItem ("Exit");
        exitItem.setMnemonic ('x');
        fileMenu.add (exitItem);
        exitItem.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    System.exit (0);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END exitItem.addActionListener

        JMenuBar bar = new JMenuBar ();
        setJMenuBar (bar);
        bar.add (fileMenu);

        JMenu formatMenu = new JMenu ("Format");
        formatMenu.setMnemonic ('r');

        String colors [] = {"Black", "Blue", "Red", "Green"};

        JMenu colorMenu = new JMenu ("Color");
        colorMenu.setMnemonic ('C');

        colorItems = new JRadioButtonMenuItem [colors.length];
        colorGroup = new ButtonGroup ();
        ItemHandler itemHandler = new ItemHandler ();

        for (int count = 0; count < colors.length; count++) {
            colorItems [count] = new JRadioButtonMenuItem (colors [count]);
            colorMenu.add (colorItems [count]);
            colorGroup.add (colorItems [count]);
            colorItems [count].addActionListener (itemHandler);
        }//END for (int count = 0; count < colors.length; count++)

        colorItems [0].setSelected (true);

        formatMenu.add (colorMenu);
        formatMenu.addSeparator ();

        String fontNames [] = {"Serif", "Monospaced", "SansSerif"};

        JMenu fontMenu = new JMenu ("Font");
        fontMenu.setMnemonic ('n');

        fonts = new JRadioButtonMenuItem [fontNames.length];
        fontGroup = new ButtonGroup ();

        for (int count = 0; count < fonts.length; count++) {
            fonts [count] = new JRadioButtonMenuItem (fontNames [count]);
            fontMenu.add (fonts [count]);
            fontGroup.add (fonts [count]);
            fonts [count].addActionListener (itemHandler);
        }//END for (int count = 0; count < fonts.length; count++)

        fonts [0].setSelected (true);

        fontMenu.addSeparator ();

        String styleNames [] = {"Bold", "Italic"};

        styleItems = new JCheckBoxMenuItem [styleNames.length];
        StyleHandler styleHandler = new StyleHandler ();

        for (int count = 0; count < styleNames.length; count++) {
            styleItems [count] = new JCheckBoxMenuItem (styleNames [count]);
            fontMenu.add (styleItems [count]);
            styleItems [count].addItemListener (styleHandler);
        }//END for (int count = 0; count < styleNames.length; count++)

        formatMenu.add (fontMenu);

        bar.add (formatMenu);

        displayLabel = new JLabel ("Sample Text", SwingConstants.CENTER);
        displayLabel.setForeground (colorValues [0]);
        displayLabel.setFont (new Font ("Serif", Font.PLAIN, 72));

        getContentPane ().setBackground (Color.CYAN);
        getContentPane ().add (displayLabel, BorderLayout.CENTER);

        setSize (500, 200);
        setVisible (true);
    }//END public MenuTest ()

    public static void main (String [] args) {
        MenuTest application = new MenuTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    private class ItemHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            for (int count = 0; count < colorItems.length; count++) {
                if (colorItems [count].isSelected ()) {
                    displayLabel.setForeground (colorValues [count]);
                    break;
                }//END if (colorItems [count].isSelected ())
            }//END for (int count = 0; count < colorItems.length; count++)

            for (int count = 0; count < fonts.length; count++) {
                if (event.getSource () == fonts [count]) {
                    displayLabel.setFont (new Font (fonts [count].getText (), 
                                          style, 72));
                    break;
                }//END if (event.getSource () == fonts [count])
            }//END for (int count = 0; count < fonts.length; count++)

            repaint ();
        }//END public void actionPerformed (ActionEvent event)
    }//END private class ItemHandler

    private class StyleHandler implements ItemListener {
        public void itemStateChanged (ItemEvent e) {
            style = 0;

            if (styleItems [0].isSelected ())
                style += Font.BOLD;

            if (styleItems [1].isSelected ())
                style += Font.ITALIC;

            displayLabel.setFont (new Font (displayLabel.getFont ().getName (), 
                                  style, 72));

            repaint ();
        }//END public void itemStateChanged (ItemEvent e)
    }//END private class StyleHandler
}//END public class MenuTest