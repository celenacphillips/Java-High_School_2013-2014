//Celena Williams

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class LoadImageAndScale extends JApplet {
    private Image logo1;
    private ImageIcon logo2;

    public void init () {
        logo1 = getImage (getDocumentBase (), "logo.gif");
        logo2 = new ImageIcon ("logo.gif");
    }//END public void init ()

    public void paint (Graphics g) {
        g.drawImage (logo1, 0, 0, this);

        g.drawImage (logo1, 0, 120, getWidth (), getHeight () - 120, this);

        logo2.paintIcon (this, g, 180, 0);
    }//END public void paint (Graphics g)
}//END public class LoadImageAndScale