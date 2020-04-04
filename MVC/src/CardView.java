//View represents the visualization of the data that model contains.

public class CardView {
   public void printCardDetails(String playerName, String cardType, String cardValue, String cardNumber, String cardYear){
      System.out.println("Card Details: ");
      System.out.println("Player Name: " + playerName);
      System.out.println("Card Type: " + cardType);
      System.out.println("Card Value: " + cardValue);
      System.out.println("Card Number: " + cardNumber);
      System.out.println("Card : " + cardYear);
   }
}
