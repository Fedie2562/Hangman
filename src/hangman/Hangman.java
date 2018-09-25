/*
 * Ferris D.
 * 25/09/2018
 * This is a hangman game using famous characters from different forms forms of entertainment
 */

package hangman;

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
        String chosenName= names[(int)(Math.random()*11)];
        System.out.println("Choose letters one by one to get the full name");
        while(solved==false){
            
        }
    }
    
}
