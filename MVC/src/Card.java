//Model - Model represents an object or JAVA POJO carrying data. 
//It can also have logic to update controller if its data changes

public class Card {

		 private String playerName;
		 private String cardType;
		 private String cardValue;
		 private String cardNumber;
		 private String cardYear;
		   
		   public String getPlayerName() {
		      return playerName;
		   }
		   
		   public void setPlayerName(String playerName) {
		      this.playerName = playerName;
		   }
		   
		   public String getCardType() {
		      return cardType;
		   }
		   
		   public void setCardType(String cardType) {
		      this.cardType = cardType;
		   }

		   public String getCardValue() {
		      return cardValue;
		   }
		   
		   public void setCardValue(String cardValue) {
		      this.cardValue = cardValue;
		   }
		   
		   public String getCardNumber() {
			  return cardNumber;
		   }
			   
		   public void setCardNumber(String cardNumber) {
			  this.cardNumber = cardNumber;
		   } 
		   
		   public String getCardYear() {
			  return cardYear;
		   }
				   
		   public void setCardYear(String cardYear) {
			   this.cardYear = cardYear;
		   } 
		   
		   
		}
