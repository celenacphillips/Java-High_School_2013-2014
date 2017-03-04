//Celena Williams

import javax.swing.JOptionPane;

public class Consonant {
    public static void main (String [] args) {
        String word, wordLowerCase;
        char letter;
        int consonants = 0;
        int vowels = 0;
        int total = 0;

        word = JOptionPane.showInputDialog ("Enter any word");
        wordLowerCase = word.toLowerCase ();

        for (int counter = 0; counter < wordLowerCase.length (); counter++) {
            letter = wordLowerCase.charAt (counter);

            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o'
             && letter != 'u' && letter != ' ')
                consonants++;
            else if (letter != ' ' && letter == 'a' || letter == 'e' || 
                     letter == 'i' || letter == 'o' || letter == 'u')
                vowels++;

            total = consonants + vowels;
        }//END for (int...counter++)

        JOptionPane.showMessageDialog (null, "Your word: " + word + 
                                       "\nConsonants: " + consonants + 
                                       "\nVowels: " + vowels + 
                                       "\nTotal letters: " + total);
    }//END public static void main (String [] args)
}//END public class Consonant