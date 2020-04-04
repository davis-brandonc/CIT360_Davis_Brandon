//Controller acts on both model and view. 
//It controls the data flow into model object and updates the view whenever data changes. 
//It keeps view and model separate

public class CardController {
	
		   private Card model;
		   private CardView view;

		   public CardController(Card model, CardView view){
		      this.model = model;
		      this.view = view;
		   }

		   public void setCardPlayerName(String playerName){
		      model.setPlayerName(playerName);		
		   }

		   public String getCardPlayerName(){
		      return model.getPlayerName();		
		   }

		   public void setCardCardType(String cardType){
		      model.setCardType(cardType);		
		   }

		   public String getCardCardType(){
		      return model.getCardType();		
		   }
		   
		   public void setCardCardValue(String cardValue){
			   model.setCardValue(cardValue);		
		   }

		   public String getCardCardValue(){
			   return model.getCardValue();		
		   }
		   
		   public void setCardCardNumber(String cardNumber){
			   model.setCardNumber(cardNumber);		
		   }

		   public String getCardCardNumber(){
			   return model.getCardNumber();		
		   }
		   
		   public void setCardCardYear(String cardYear){
			   model.setCardYear(cardYear);		
		   }

		   public String getCardCardYear(){
			   return model.getCardYear();		
		   }
		   
		   public void updateView(){				
		      view.printCardDetails(model.getPlayerName(), model.getCardType(), model.getCardValue(), model.getCardNumber(), model.getCardYear());
		   }	
		}

