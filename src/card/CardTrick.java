/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Arrays;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Justin Laing
 * @student_number 991470561
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13));
            c.setSuit(Card.SUITS[(rand.nextInt(4))]);
            magicHand[i] = c;
        }

        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(11);
        luckyCard.setSuit("Spades");

        if (Arrays.asList(magicHand).contains(luckyCard)) {
            System.out.println("The lucky card was in the magic hand!");
        } else {
            System.out.println("The lucky card was not in the magic hand!");
        }

    }
    
}
