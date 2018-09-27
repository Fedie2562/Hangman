/*
 * Ferris D.
 * 25/09/2018
 * This is a hangman game using random words
 */

package hangman;
import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String words[] = {"random", "special", "extreme", "famous", "notorious"};
        String stuff[] = {"television", "toilet", "stick", "chair", "rock", "table"};
        //
        String gameWords[][] = {words,stuff};
        // array for the hangman graphics
        String censoredWord, chosenWord;
        String graphic[] = {"  O \n/ | \\\n  |\n/   \\", "  O \n/ | \\\n  |\n/", "  O \n/ | \\\n  |", "  O \n/ | \\", "  O \n/ |", "  O \n/", "  O", " "};
        int randomNum1, randomNum2, guesses, numWords;
        randomNum1 = (int) (Math.random() * gameWords.length);
        randomNum2 = (int) (Math.random() * (gameWords[randomNum1].length - 1) + 1);
        chosenWord = gameWords[randomNum1][randomNum2];
        //
        censoredWord = "";
        numWords = 0;
        //
        for (int pos = 0; pos < chosenWord.length(); pos++) {
            //Convert the char at position pos to an int
            //If it is between 'A' and 'Z', add a dash
            if (((int) chosenWord.charAt(pos) >= 65) && ((int) chosenWord.charAt(pos) <= 90)) {
                censoredWord += "-";
            } else {
                censoredWord += chosenWord.charAt(pos);
                if (chosenWord.charAt(pos) == ' ') {
                    numWords++;
                }
            }
        }
        System.out.println(censoredWord + "\n" + chosenWord);
    }
}
