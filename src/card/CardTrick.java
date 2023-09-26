/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Card guess = new Card();
        System.out.println("Pick a card, any card:");

        Scanner stdin  = new Scanner(System.in);
        System.out.print("Select a suit (Hearts, Diamonds, Spades, Clubs): ");
        guess.setSuit(stdin.nextLine());
        while (!Arrays.asList(Card.SUITS).contains(guess.getSuit())) {
            System.out.print("Not a valid suit. Try again: ");
            guess.setSuit(stdin.nextLine());
        }

        System.out.print("Select a value (1-13): ");
        guess.setValue(stdin.nextInt()); 
        while (guess.getValue() < 1 || guess.getValue() > 13) {
            System.out.print("Not a valid value. Try again: ");
            guess.setValue(stdin.nextInt()); 
        }
        stdin.close();

        //Then report the result here
        if (Arrays.asList(magicHand).contains(guess)) {
            System.out.println("Your card was in the magic hand!");
        } else {
            System.out.println("Your card was not in the magic hand!");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
