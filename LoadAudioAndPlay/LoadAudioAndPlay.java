//Celena Williams

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoadAudioAndPlay extends JApplet {
    private AudioClip sound1, sound2, currentSound;
    private JButton playSound, loopSound, stopSound;
    private JComboBox chooseSound;

    public void init () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        String choices [] = {"Welcome", "Hi"};
        chooseSound = new JComboBox (choices);

        chooseSound.addItemListener (
            new ItemListener () {
                public void itemStateChanged (ItemEvent e) {
                    currentSound.stop ();
                    currentSound = chooseSound.getSelectedIndex () == 0 ? 
                                   sound1 : sound2;
                }//END public void itemStateChanged (ItemEvent e)
            }//END new ItemListener ()
        );//END chooseSound.addItemListener

        container.add (chooseSound);

        ButtonHandler handler = new ButtonHandler ();

        playSound = new JButton ("Play");
        playSound.addActionListener (handler);
        container.add (playSound);

        loopSound = new JButton ("Loop");
        loopSound.addActionListener (handler);
        container.add (loopSound);

        stopSound = new JButton ("Stop");
        stopSound.addActionListener (handler);
        container.add (stopSound);

        sound1 = getAudioClip (getDocumentBase (), "welcome.wav");
        sound2 = getAudioClip (getDocumentBase (), "hi.au");
        currentSound = sound1;
    }//END public void init ()

    public void stop () {
        currentSound.stop ();
    }//END public void stop ()

    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent actionEvent) {
            if (actionEvent.getSource () == playSound)
                currentSound.play ();
            else
                if (actionEvent.getSource () == loopSound)
                    currentSound.loop ();
                else
                    if (actionEvent.getSource () == stopSound)
                        currentSound.stop ();
        }//END public void actionPerformed (ActionEvent actionEvent)
    }//END private class ButtonHandler
}//END public class LoadAudioAndPlay