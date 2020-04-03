import static org.junit.Assert.*;				
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


public class JUnitA {

	@Test		
	    public void baseballCards(){					
	        		
	        //Variable declaration		
	        String card1="Ken Griffey Jr.";					
	        String card2="Ken Griffey Jr.";					
	        String card3="Mickey Mantle";					
	        String card4="Mickey Mantle";					
	        String card5=null;					
	        int cardnumber1=203;					
	        int	cardnumber2=204;
	        int cardnumber3=205;
	        int cardnumber4=206;
	        int[] airethematicArrary1 = { 203, 204, 205, 206, 0 };					
	        int[] airethematicArrary2 = { 203, 204, 205, 206, 0 };					
	        String card6 = new String("Babe Ruth"); 
	        String card7 = new String("Hank Aaron");
	        
	        //Assert statements		
	        assertEquals(card1, card2);					
	        assertSame(card3, card4);					
	        assertNotSame(card2, card4);
	        assertNotNull(card1);			
	        assertNull(card5);			
	        assertTrue(cardnumber1<cardnumber2);					
	        assertArrayEquals(airethematicArrary1, airethematicArrary2);
	        assertFalse(cardnumber4<cardnumber3);
	        assertThat(card6, equalTo(card7));
	       
	    }		
	}

