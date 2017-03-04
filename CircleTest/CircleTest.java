//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleTest extends JFrame implements ActionListener {
    private JPanel bottomPanel;
    private CirclePanel topPanel;
    private JTextArea textArea;
    private JButton drawButton;
    static double diameter;

    public CircleTest () {
        super ("CircleTest");

        topPanel = new CirclePanel ();
        topPanel.setBackground (Color.BLACK);
        bottomPanel = new JPanel ();
        textArea = new JTextArea ("Diameter:\nRadius:\nArea:\nCircumfrence:");
        textArea.setEditable (false);
        drawButton = new JButton ("Draw");
        drawButton.addActionListener (this);

        Container container = getContentPane ();
        container.setLayout (new BorderLayout ());

        container.add (topPanel, BorderLayout.CENTER);
        container.add (drawButton, BorderLayout.NORTH);
        container.add (bottomPanel, BorderLayout.SOUTH);

        bottomPanel.add (textArea);

        setSize (600, 500);
        setVisible (true);
    }//END public CircleTest ()

    public void actionPerformed (ActionEvent e) {
        double area, radius, circumfrence;

        topPanel.draw (CirclePanel.DRAW);

        diameter = (Math.random () * 500);
        radius = diameter / 2;
        area = (Math.PI) * (Math.pow (radius, 2));
        circumfrence = 2 * (Math.PI) * radius;

        textArea.setText("Diameter: " + diameter + "\nRadius: " + radius + 
                         "\nArea: " + area + "\nCircumfrence: " + circumfrence);
    }//END public void actionPerformed (ActionEvent e)

    public static void main (String [] args) {
        CircleTest application = new CircleTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    private class CirclePanel extends JPanel {
        public final static int DRAW = 1;
        private int shape;

        public void paintComponent (Graphics g) {
            super.paintComponent (g);

            if (shape == DRAW) {
                g.setColor (Color.CYAN);
                g.fillOval (10, 10, (int) diameter, (int) diameter);

                g.setColor (Color.RED);
                g.drawString (diameter + "",(int) diameter, (int) diameter / 2);
            }//END if (shape == DRAW)
        }//END public void paintComponent (Graphics g)

        public void draw (int shapeToDraw) {
            shape = shapeToDraw;
            repaint ();
        }//END public void draw (int shapeToDraw)
    }//END private class CirclePanel
}//END public class CircleTest