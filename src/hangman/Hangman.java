/*
 * Ferris D.
 * 25/09/2018
 * This is a hangman game using famous characters from different forms forms of entertainment
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
        boolean solved = false;
        String names[]= {"Patrick Bateman", "Steve Rogers", "Spongebob Squarepants", "Ellen Ripley", 
                         "Sarah Connor", "Sam Witwicky", "Lightning McQueen", "Captain Jack Sparrow",
                         "Luke Skywalker", "Frodo Baggins", "Shadow Fiend"};
        char[] chosenName= names[(int)(Math.random()*11)].toCharArray();
        System.out.println("Choose letters one by one to get the full name");
        String censoredName = "";
        char letter=' ';
        while(solved==false){
            for(int i = 0;i < chosenName.length;i++){
                if(chosenName[i]!=' '&&chosenName[i]!='_'){
                    censoredName += "_";
                }else {
                    censoredName += " ";
                }
                censoredName += " ";
            }
            System.out.println(censoredName);
            letter = JOptionPane.showInputDialog("Please enter your letter here").charAt(0);
            System.out.println("You have guessed "+letter);
            for(int i = 0;i < chosenName.length;i++){
                if(letter == chosenName[i]){
                    censoredName = censoredName.substring(0,i*2-1)+chosenName[i]+censoredName.substring(i*2);
                }
            }
        }
    }
    
}
