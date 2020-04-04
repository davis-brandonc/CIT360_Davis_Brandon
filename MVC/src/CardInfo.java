public class CardInfo {
   public static void main(String[] args) {

      
      Card model  = retriveCardFromDatabase();

      CardView view = new CardView();

      CardController controller = new CardController(model, view);

      controller.updateView();

      //update model data
      controller.setCardPlayerName("Ken Griffey Jr.");
      System.out.println(" ");
      
      controller.updateView();
   }

   private static Card retriveCardFromDatabase(){
      Card card = new Card();
      card.setPlayerName("Mickey Mantle.");
      card.setCardType("Upper Deck");
      card.setCardValue("$50.00");
      card.setCardNumber("1");
      card.setCardYear("1989");
      
      return card;
      
   }
}