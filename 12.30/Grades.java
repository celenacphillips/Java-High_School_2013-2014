//Celena Williams

import java.awt.*;
import javax.swing.*;

public class Grades extends JFrame {
    static String strFreshmen, strSophomores, strJuniors, strSeniors;
    static int freshmen, sophomores, juniors, seniors;

    public Grades () {
        super ("Number of Students In Each Class");

        setVisible (true);
        setSize (900, 800);
    }//END public Grades ()

    public static void main (String [] args) {
        strFreshmen = JOptionPane.showInputDialog 
                                               ("Enter the number of Freshmen");
        strSophomores = JOptionPane.showInputDialog
                                             ("Enter the number of Sophomores");
        strJuniors = JOptionPane.showInputDialog
                                                ("Enter the number of Juniors");
        strSeniors = JOptionPane.showInputDialog
                                                ("Enter the number of Seniors");

        freshmen = Integer.parseInt (strFreshmen);
        sophomores = Integer.parseInt (strSophomores);
        juniors = Integer.parseInt (strJuniors);
        seniors = Integer.parseInt (strSeniors);

        Grades application = new Grades ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    public void paint (Graphics g) {
        super.paint (g);

        g.setColor (Color.LIGHT_GRAY);
        g.drawLine (100, 650, 850, 650);
        g.drawLine (100, 600, 850, 600);
        g.drawLine (100, 550, 850, 550);
        g.drawLine (100, 500, 850, 500);
        g.drawLine (100, 450, 850, 450);
        g.drawLine (100, 400, 850, 400);
        g.drawLine (100, 350, 850, 350);
        g.drawLine (100, 300, 850, 300);
        g.drawLine (100, 250, 850, 250);
        g.drawLine (100, 200, 850, 200);
        g.drawLine (100, 150, 850, 150);
        g.drawLine (100, 100, 850, 100);
        g.drawLine (100, 50, 850, 50);

        g.setColor (Color.BLACK);
        g.drawLine (100, 50, 100, 700);
        g.drawLine (100, 700, 850, 700);
        g.drawString ("Freshmen", 170, 715);
        g.drawString ("Sophomores", 370, 715);
        g.drawString ("Juniors", 570, 715);
        g.drawString ("Seniors", 770, 715);

        g.drawString ("0", 90, 700);
        g.drawString ("100", 80, 650);
        g.drawString ("200", 80, 600);
        g.drawString ("300", 80, 550);
        g.drawString ("400", 80, 500);
        g.drawString ("500", 80, 450);
        g.drawString ("600", 80, 400);
        g.drawString ("700", 80, 350);
        g.drawString ("800", 80, 300);
        g.drawString ("900", 80, 250);
        g.drawString ("1000", 70, 200);
        g.drawString ("1100", 70, 150);
        g.drawString ("1200", 70, 100);
        g.drawString ("< = 1300", 50, 50);

        g.setColor (Color.GREEN);
        g.fillRect (170, 700, 50, - (freshmen / 2));

        g.setColor (Color.ORANGE);
        g.fillRect (370, 700, 50, - (sophomores / 2));

        g.setColor (Color.RED);
        g.fillRect (570, 700, 50, - (juniors / 2));

        g.setColor (Color.YELLOW);
        g.fillRect (770, 700, 50, - (seniors / 2));
    }//END public void paint (Graphics g)
}//END public class Grades