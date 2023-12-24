/******************************************************
  * This program is to simulate the action of picking *
  * of a card from a deck of 52 cards.                *
  *****************************************************/
import java.util.Random;

public class PickACard {
   enum Ranks {
      Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
   }

   enum Suits {
      Spades, Hearts, Diamonds, Clubs
   }

   public static Suits suitsMethod(int s) {
      return Suits.values()[s];
   }

   public static Ranks ranksMethod(int r) {
      return Ranks.values()[r];
   }

   /*
    * Alternatively similar and readable methods *
    * public static Suits suitsMethod(int s)
    * {
    * Suits cardSuits;
    * 
    * if (s == 0 )
    * cardSuits = Suits.Spades;
    * else if (s == 1)
    * cardSuits = Suits.Hearts;
    * else if (s == 2)
    * cardSuits = Suits.Diamonds;
    * else
    * cardSuits = Suits.Clubs;
    * 
    * return cardSuits;
    * }
    * 
    * public static Ranks ranksMethod(int r)
    * {
    * Ranks cardRanks;
    * 
    * if (r == 0 )
    * cardRanks = Ranks.Ace;
    * else if (r == 1)
    * cardRanks = Ranks.Two;
    * else if (r == 2)
    * cardRanks = Ranks.Three;
    * else if (r == 3)
    * cardRanks = Ranks.Four;
    * else if (r == 4)
    * cardRanks = Ranks.Five;
    * else if (r == 5)
    * cardRanks = Ranks.Six;
    * else if (r == 6)
    * cardRanks = Ranks.Seven;
    * else if (r == 7)
    * cardRanks = Ranks.Eight;
    * else if (r == 8)
    * cardRanks = Ranks.Nine;
    * else if (r == 9)
    * cardRanks = Ranks.Ten;
    * else if (r == 10)
    * cardRanks = Ranks.Jack;
    * else if (r == 11)
    * cardRanks = Ranks.Queen;
    * else
    * cardRanks = Ranks.King;
    * 
    * return cardRanks;
    * }
    */
   public static void main(String[] args) {
      Random rand = new Random();

      int cardDeck = rand.nextInt(52);
      int cardSuits = cardDeck / 13;
      int cardRanks = cardDeck % 13;

      System.out.println(">----------- Heres Your Card -----------<");
      System.out.println("\t    " + ranksMethod(cardRanks) + " of " + suitsMethod(cardSuits));
      System.out.println(">---------------------------------------<");

   }// end main
}// end class